package fixtures.http;

import com.microsoft.rest.v2.RestResponse;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import fixtures.http.implementation.AutoRestHttpInfrastructureTestServiceImpl;
import io.reactivex.functions.Consumer;

public class HttpRetryTests {
    private static AutoRestHttpInfrastructureTestService client;
    private CountDownLatch lock = new CountDownLatch(1);

    @BeforeClass
    public static void setup() {
        client = new AutoRestHttpInfrastructureTestServiceImpl("http://localhost:3000");
    }

    @Test
    public void head408() throws Exception {
        client.httpRetrys().head408WithRestResponseAsync()
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(1000, TimeUnit.MILLISECONDS));
    }

    @Test
    public void put500() throws Exception {
        client.httpRetrys().put500WithRestResponseAsync(true)
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(1000, TimeUnit.MILLISECONDS));
    }

    @Test
    public void patch500() throws Exception {
        client.httpRetrys().patch500WithRestResponseAsync(true)
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(1000, TimeUnit.MILLISECONDS));
    }

    @Test
    public void get502() throws Exception {
        client.httpRetrys().get502WithRestResponseAsync()
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(50000, TimeUnit.MILLISECONDS));
    }

    @Test
    public void post503() throws Exception {
        client.httpRetrys().post503WithRestResponseAsync(true)
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(1000, TimeUnit.MILLISECONDS));
    }

    @Test
    public void delete503() throws Exception {
        client.httpRetrys().delete503WithRestResponseAsync(true)
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(1000, TimeUnit.MILLISECONDS));
    }

    @Test
    public void put504() throws Exception {
        client.httpRetrys().put504WithRestResponseAsync(true)
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(1000, TimeUnit.MILLISECONDS));
    }

    @Test
    public void patch504() throws Exception {
        client.httpRetrys().patch504WithRestResponseAsync(true)
            .subscribe(new Consumer<RestResponse<Void, Void>>() {
                @Override
                public void accept(RestResponse<Void, Void> response) {
                    Assert.assertEquals(200, response.statusCode());
                    lock.countDown();
                }
            });
        Assert.assertTrue(lock.await(1000, TimeUnit.MILLISECONDS));
    }
}
