package revapi;

import org.revapi.*;
import org.revapi.java.JavaApiAnalyzer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Revapi revapi = Revapi.builder().withAnalyzers(JavaApiAnalyzer.class).build();
        List<Archive> oldArchives = new ArrayList<>();
        List<Archive> newArchives = new ArrayList<>();
        API oldApi = new API(oldArchives);
        API newApi = new API(newArchives);
        AnalysisContext context = AnalysisContext.builder(revapi).withOldAPI().withNewAPI().build();
        AnalysisResult result = revapi.analyze(context);
        System.out.println(result);
    }
}
