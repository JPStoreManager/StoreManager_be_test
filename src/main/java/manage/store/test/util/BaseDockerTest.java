package manage.store.test.util;

import org.testcontainers.containers.DockerComposeContainer;

import java.io.File;
import java.io.IOException;

public class BaseDockerTest {

    /**
     * Test용 Docker Compose Container 생성 및 반환
     */
    protected static DockerComposeContainer getDockerComposeContainer(){
        File file = new File("../docker-compose.test.yml");
        return new DockerComposeContainer(file);
    }

}
