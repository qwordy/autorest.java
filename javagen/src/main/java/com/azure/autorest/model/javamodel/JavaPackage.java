package com.azure.autorest.model.javamodel;

import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.extension.base.plugin.NewPlugin;
import com.azure.autorest.extension.base.plugin.PluginLogger;
import com.azure.autorest.model.clientmodel.*;
import com.azure.autorest.model.xmlmodel.XmlFile;
import com.azure.autorest.template.Templates;
import org.slf4j.Logger;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaPackage {
    private final Logger logger;

    private final JavaSettings settings;
    private final List<JavaFile> javaFiles;
    private final List<XmlFile> xmlFiles;
    private final List<PlainFile> plainFiles;
    private final JavaFileFactory javaFileFactory;

    private final Set<String> filePaths = new HashSet<>();

    private Map<String, String> model;

    public JavaPackage(NewPlugin host) {
        this.settings = JavaSettings.getInstance();
        this.javaFiles = new ArrayList<>();
        this.xmlFiles = new ArrayList<>();
        this.plainFiles = new ArrayList<>();
        this.javaFileFactory = new JavaFileFactory(settings);
        this.logger = new PluginLogger(host, JavaPackage.class);
    }

    protected JavaFileFactory getJavaFileFactory() {
        return javaFileFactory;
    }

    public List<JavaFile> getJavaFiles() {
        return javaFiles;
    }

    public List<XmlFile> getXmlFiles() {
        return xmlFiles;
    }

    public List<PlainFile> getPlainFiles() {
        return plainFiles;
    }

    public final void addManager(String package_Keyword, String name, Manager model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getManagerTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClient(String package_Keyword, String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getServiceClientTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addAsyncServiceClient(String packageKeyWord, AsyncSyncClient asyncClient) {
        JavaFile javaFile = javaFileFactory.createSourceFile(packageKeyWord, asyncClient.getClassName());
        Templates.getServiceAsyncClientTemplate().write(asyncClient, javaFile);
        addJavaFile(javaFile);
    }

    public final void addSyncServiceClient(String packageKeyWord, AsyncSyncClient syncClient) {
        JavaFile javaFile = javaFileFactory.createSourceFile(packageKeyWord, syncClient.getClassName());
        Templates.getServiceSyncClientTemplate().write(syncClient, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClientInterface(String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(settings.getPackage(), name);
        Templates.getServiceClientInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClientInterface(String package_Keyword, String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getServiceClientInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClientBuilder(String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(settings.getPackage(), name);
        Templates.getServiceClientBuilderTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceClientBuilder(String package_Keyword, String name, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getServiceClientBuilderTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addServiceVersion(String package_Keyword, String serviceName, String className,
                                        List<String> serviceVersions, ServiceClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, className);
        Templates.getServiceVersionTemplate().serviceName(serviceName).className(className)
                .serviceVersions(serviceVersions).write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addMethodGroup(String package_Keyword, String name, MethodGroupClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getMethodGroupTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addMethodGroupInterface(String name, MethodGroupClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(settings.getPackage(), name);
        Templates.getMethodGroupInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addMethodGroupInterface(String package_Keyword, String name, MethodGroupClient model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getMethodGroupInterfaceTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addModel(String package_Keyword, String name, ClientModel model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getModelTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addException(String package_Keyword, String name, ClientException model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getExceptionTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addEnum(String package_Keyword, String name, EnumType model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getEnumTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addPage(String package_Keyword, String name, PageDetails model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getPageTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addClientResponse(String package_Keyword, String name, ClientResponse model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getResponseTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addXmlSequenceWrapper(String package_Keyword, String name, XmlSequenceWrapper model) {
        JavaFile javaFile = javaFileFactory.createSourceFile(package_Keyword, name);
        Templates.getXmlSequenceWrapperTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addPackageInfo(String package_Keyword, String name, PackageInfo model) {
        JavaFile javaFile = javaFileFactory.createEmptySourceFile(package_Keyword, name);
        Templates.getPackageInfoTemplate().write(model, javaFile);
        addJavaFile(javaFile);
    }

    public final void addModuleInfo(ModuleInfo moduleInfo) {
        JavaFile javaFile = javaFileFactory.createEmptySourceFile("", "module-info");
        Templates.getModuleInfoTemplate().write(moduleInfo, javaFile);
        addJavaFile(javaFile);
    }

    public final void addChangelog() {
        PlainFile plainFile = new PlainFile("CHANGELOG.md");
        plainFile.loadFromResource("changelog.md", settings.getLlcProperties());
        addPlainFile(plainFile);
    }

    public final void addServicePom() {
        PlainFile plainFile = new PlainFile("pom.xml");
        plainFile.loadFromResource("pom.xml", settings.getLlcProperties());
        addPlainFile(plainFile);
    }

    public final void addReadme() {
        PlainFile plainFile = new PlainFile("README.md");
        plainFile.loadFromResource("readme.md", settings.getLlcProperties());
        addPlainFile(plainFile);
    }

    public final void addSampleReadme() {
        PlainFile plainFile = new PlainFile(Paths.get("src", "samples", "README.md").toString());
        plainFile.loadFromResource("sample_readme.md", settings.getLlcProperties());
        addPlainFile(plainFile);
    }

    public final void addPom(String name, Pom pom) {
        XmlFile xmlFile = new XmlFile(name, new XmlFile.Options().setIndent(2));
        Templates.getPomTemplate().write(pom, xmlFile);
        this.checkDuplicateFile(xmlFile.getFilePath());
        xmlFiles.add(xmlFile);
    }

    protected void addJavaFile(JavaFile javaFile) {
        this.checkDuplicateFile(javaFile.getFilePath());
        filePaths.add(javaFile.getFilePath());
        javaFiles.add(javaFile);
    }

    public void addPlainFile(PlainFile plainFile) {
        plainFiles.add(plainFile);
    }

    protected void checkDuplicateFile(String filePath) {
        if (filePaths.contains(filePath)) {
//            throw new IllegalStateException(String.format("Name conflict for output file '%1$s'.", filePath));
            logger.warn(String.format("Name conflict for output file '%1$s'.", filePath));
        }
    }
}
