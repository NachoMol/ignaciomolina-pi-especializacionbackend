 docker compose build --no-cache
[+] Building 48.7s (14/14) FINISHED
 => [internal] load build definition from Dockerfile                                                         0.1s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             2.5s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       2.6s
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => [internal] load build context                                                                            0.0s
 => => transferring context: 829B                                                                            0.0s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => [build 3/5] COPY pom.xml .                                                                               0.0s
 => [build 4/5] COPY src ./src                                                                               0.0s
 => [build 5/5] RUN mvn clean package -DskipTests                                                           44.0s
 => [stage-1 3/3] COPY --from=build /app/target/*.jar app.jar                                                1.2s
 => exporting to image                                                                                       0.2s
 => => exporting layers                                                                                      0.2s
 => => writing image sha256:be2871ddda342eb605706f3f0eb62d2aa4f41f669e9d9040fa06a3db33cb9123                 0.0s
 => => naming to docker.io/library/pi-backend-itm-eureka-server                                              0.0s
[+] Building 0.0s (0/0)
[+] Building 0.0s (0/0)
[+] Building 0.0s (0/0)
[+] Building 0.2s (1/1)
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 0.2s (2/2)
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 0.3s (2/2)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 0.5s (2/4)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 0.5s (2/4)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
[+] Building 0.8s (2/4)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
[+] Building 1.0s (10/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 4.9s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.8s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.6s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => [internal] load build context                                                                            0.2s
 => => transferring context: 1.86kB                                                                          0.1s
 => [build 3/5] COPY pom.xml .                                                                               0.1s
 => [build 4/5] COPY src ./src                                                                               0.1s
 => [build 5/5] RUN mvn clean package -DskipTests                                                            3.4s
 => => transferring context: 8.29kB                                                                          0.0s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s
 => [build 3/5] COPY pom.xml .                                                                               0.0s
 => [build 4/5] COPY src ./src                                                                               0.1s
 => [build 5/5] RUN mvn clean package -DskipTests                                                            3.6s
[+] Building 6.6s (11/13)
[+] Building 8.5s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
[+] Building 9.1s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 9.6s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 10.7s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.8s
[+] Building 16.8s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
[+] Building 21.1s (11/13)
[+] Building 22.7s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 25.0s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 27.1s (11/13)
[+] Building 33.1s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
[+] Building 35.5s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 39.1s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 43.3s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 45.5s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
[+] Building 47.4s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 53.4s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 53.7s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
[+] Building 53.9s (11/13)
[+] Building 54.6s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.1s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.7s
[+] Building 56.0s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
[+] Building 56.6s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.1s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.7s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.6s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => [internal] load build context                                                                            0.1s
[+] Building 57.3s (12/13)
 => [internal] load build definition from Dockerfile                                                         0.1s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.7s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.6s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => [internal] load build context                                                                            0.1s
 => => transferring context: 1.05kB                                                                          0.1s
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s
 => [build 3/5] COPY pom.xml .                                                                               0.0s
 => [build 4/5] COPY src ./src                                                                               0.1s
 => ERROR [build 5/5] RUN mvn clean package -DskipTests                                                     56.1s
------
 > [build 5/5] RUN mvn clean package -DskipTests:
#0 3.795 [INFO] Scanning for projects...
#0 4.543 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-parent/3.3.3/spring-boot-starter-parent-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/
3.3.3/spring-boot-starter-parent-3.3.3.pom (13 kB at 12 kB/s)
#0 5.743 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-depen
dencies/3.3.3/spring-boot-dependencies-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/3.
3.3/spring-boot-dependencies-3.3.3.pom (100 kB at 977 kB/s)
#0 5.956 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-dep
endencies/2023.0.3/spring-cloud-dependencies-2023.0.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-dependencies/
2023.0.3/spring-cloud-dependencies-2023.0.3.pom (10 kB at 184 kB/s)
#0 6.023 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-dep
endencies-parent/4.1.3/spring-cloud-dependencies-parent-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-dependencies-
parent/4.1.3/spring-cloud-dependencies-parent-4.1.3.pom (7.6 kB at 108 kB/s)
#0 6.120 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-com
mons-dependencies/4.1.4/spring-cloud-commons-dependencies-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-commons-depen
dencies/4.1.4/spring-cloud-commons-dependencies-4.1.4.pom (7.2 kB at 100 kB/s)
#0 6.212 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-net
flix-dependencies/4.1.3/spring-cloud-netflix-dependencies-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-netflix-depen
dencies/4.1.3/spring-cloud-netflix-dependencies-4.1.3.pom (9.8 kB at 105 kB/s)
#0 6.298 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-str
eam-dependencies/4.1.3/spring-cloud-stream-dependencies-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-stream-depend
encies/4.1.3/spring-cloud-stream-dependencies-4.1.3.pom (8.6 kB at 164 kB/s)
#0 6.372 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-tas
k-dependencies/3.1.2/spring-cloud-task-dependencies-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-task-dependen
cies/3.1.2/spring-cloud-task-dependencies-3.1.2.pom (5.8 kB at 103 kB/s)
#0 6.437 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-cir
cuitbreaker-dependencies/3.1.2/spring-cloud-circuitbreaker-dependencies-3.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-circuitbreake
r-dependencies/3.1.2/spring-cloud-circuitbreaker-dependencies-3.1.2.pom (6.7 kB at 118 kB/s)
#0 6.514 Downloading from central: https://repo.maven.apache.org/maven2/io/github/resilience4j/resilience4j-bom/2.
1.0/resilience4j-bom-2.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/resilience4j/resilience4j-bom/2.1.0/resili
ence4j-bom-2.1.0.pom (6.4 kB at 98 kB/s)
#0 6.585 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-con
fig-dependencies/4.1.3/spring-cloud-config-dependencies-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-config-depend
encies/4.1.3/spring-cloud-config-dependencies-4.1.3.pom (7.5 kB at 153 kB/s)
#0 6.640 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-fun
ction-dependencies/4.1.3/spring-cloud-function-dependencies-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-function-depe
ndencies/4.1.3/spring-cloud-function-dependencies-4.1.3.pom (6.8 kB at 119 kB/s)
#0 6.702 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gat
eway-dependencies/4.1.5/spring-cloud-gateway-dependencies-4.1.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gateway-depen
dencies/4.1.5/spring-cloud-gateway-dependencies-4.1.5.pom (6.4 kB at 168 kB/s)
#0 6.745 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-con
sul-dependencies/4.1.2/spring-cloud-consul-dependencies-4.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-consul-depend
encies/4.1.2/spring-cloud-consul-dependencies-4.1.2.pom (7.5 kB at 155 kB/s)
#0 6.800 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-vau
lt-dependencies/4.1.3/spring-cloud-vault-dependencies-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-vault-depende
ncies/4.1.3/spring-cloud-vault-dependencies-4.1.3.pom (6.2 kB at 149 kB/s)
#0 6.852 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-zoo
keeper-dependencies/4.1.2/spring-cloud-zookeeper-dependencies-4.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-zookeeper-dep
endencies/4.1.2/spring-cloud-zookeeper-dependencies-4.1.2.pom (8.9 kB at 218 kB/s)
#0 6.898 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-bus
-dependencies/4.1.2/spring-cloud-bus-dependencies-4.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-bus-dependenc
ies/4.1.2/spring-cloud-bus-dependencies-4.1.2.pom (6.1 kB at 143 kB/s)
#0 6.945 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-con
tract-dependencies/4.1.4/spring-cloud-contract-dependencies-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-contract-depe
ndencies/4.1.4/spring-cloud-contract-dependencies-4.1.4.pom (8.7 kB at 175 kB/s)
#0 7.000 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-ope
nfeign-dependencies/4.1.3/spring-cloud-openfeign-dependencies-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-openfeign-dep
endencies/4.1.3/spring-cloud-openfeign-dependencies-4.1.3.pom (6.5 kB at 163 kB/s)
#0 7.053 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-bom/13.3/feign-b
om-13.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-bom/13.3/feign-bom-13.3.po
m (7.7 kB at 164 kB/s)
#0 7.105 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-kub
ernetes-dependencies/3.1.3/spring-cloud-kubernetes-dependencies-3.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-kubernetes-de
pendencies/3.1.3/spring-cloud-kubernetes-dependencies-3.1.3.pom (12 kB at 259 kB/s)
#0 7.155 Downloading from central: https://repo.maven.apache.org/maven2/io/fabric8/kubernetes-client-bom/6.9.2/kub
ernetes-client-bom-6.9.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/fabric8/kubernetes-client-bom/6.9.2/kubernetes-cl
ient-bom-6.9.2.pom (28 kB at 553 kB/s)
#0 7.210 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-bom/6.1.3/act
ivemq-bom-6.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-bom/6.1.3/activemq-bom-
6.1.3.pom (7.9 kB at 164 kB/s)
#0 7.267 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-bom/2.33.0/art
emis-bom-2.33.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-bom/2.33.0/artemis-bom-2
.33.0.pom (9.6 kB at 241 kB/s)
#0 7.308 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-project/2.33.0
/artemis-project-2.33.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-project/2.33.0/artemis-p
roject-2.33.0.pom (64 kB at 1.0 MB/s)
#0 7.383 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom (24 kB at 603 kB/
s)
[+] Building 57.3s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0so
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s.
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.7s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.5sn
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => [internal] load build context                                                                            0.0s-
 => => transferring context: 8.29kB                                                                          0.0s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s.
 => [build 3/5] COPY pom.xml .                                                                               0.0s
 => [build 4/5] COPY src ./src                                                                               0.1si
 => [build 5/5] RUN mvn clean package -DskipTests                                                           56.2s
 => => # 15.0/plexus-compiler-api-2.15.0.jar (29 kB at 404 kB/s)                                                 m
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/
 => => # 2.15.0/plexus-compiler-javac-2.15.0.jar (26 kB at 262 kB/s)                                             m
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexu
 => => # s-xml-3.0.0.jar (93 kB at 823 kB/s)                                                                     0
 => => # Progress (1): 334 kB
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.9/project-1.0.9.pom (16
 kB at 394 kB/s)
#0 7.778 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.22/groovy
-bom-4.0.22.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.22/groovy-bom-4.0.2
2.pom (27 kB at 496 kB/s)
#0 7.839 Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/15.0.7.Final
/infinispan-bom-15.0.7.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/15.0.7.Final/infinispa
n-bom-15.0.7.Final.pom (18 kB at 371 kB/s)
#0 7.893 Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configurat
ion-parent/15.0.7.Final/infinispan-build-configuration-parent-15.0.7.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent
/15.0.7.Final/infinispan-build-configuration-parent-15.0.7.Final.pom (19 kB at 352 kB/s)
#0 7.964 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/43/jboss-parent-43.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/43/jboss-parent-43.pom (75 kB
 at 1.7 MB/s)
#0 8.027 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.17.2/j
ackson-bom-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.17.2/jackson-bom
-2.17.2.pom (19 kB at 346 kB/s)
#0 8.081 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.17/
jackson-parent-2.17.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.17/jackson-pa
rent-2.17.pom (6.5 kB at 114 kB/s)
#0 8.143 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/58/oss-parent-58.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/58/oss-parent-58.pom (24 kB
 at 563 kB/s)
#0 8.195 Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.8/jers
ey-bom-3.1.8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.8/jersey-bom-3.1
.8.pom (21 kB at 433 kB/s)
#0 8.249 Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0
.12/jetty-ee10-bom-12.0.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0.12/jetty-
ee10-bom-12.0.12.pom (9.6 kB at 233 kB/s)
#0 8.289 Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.0.12/jetty-
bom-12.0.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.0.12/jetty-bom-12.0.1
2.pom (14 kB at 289 kB/s)
#0 8.342 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.3/junit-bom-5.10.
3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.3/junit-bom-5.10.3.pom (5.6
 kB at 157 kB/s)
#0 8.387 Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.9.25/kot
lin-bom-1.9.25.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.9.25/kotlin-bom-1.
9.25.pom (9.1 kB at 175 kB/s)
#0 8.446 Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-b
om/1.8.1/kotlinx-coroutines-bom-1.8.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.8.1/k
otlinx-coroutines-bom-1.8.1.pom (4.3 kB at 110 kB/s)
#0 8.484 Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-serializatio
n-bom/1.6.3/kotlinx-serialization-bom-1.6.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-serialization-bom/1.6.
3/kotlinx-serialization-bom-1.6.3.pom (3.7 kB at 83 kB/s)
#0 8.558 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.23.1/
log4j-bom-2.23.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.23.1/log4j-bom-
2.23.1.pom (12 kB at 270 kB/s)
#0 8.606 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/logging-parent/10.6.0/l
ogging-parent-10.6.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/logging-parent/10.6.0/logging-par
ent-10.6.0.pom (54 kB at 1.6 MB/s)
#0 8.647 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.13.3/microm
eter-bom-1.13.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.13.3/micrometer-bom-1
.13.3.pom (8.6 kB at 226 kB/s)
#0 8.690 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.3.3
/micrometer-tracing-bom-1.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.3.3/micromete
r-tracing-bom-1.3.3.pom (4.5 kB at 119 kB/s)
#0 8.741 Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.11.0/mockito-bom
-5.11.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.11.0/mockito-bom-5.11.0.po
m (3.0 kB at 59 kB/s)
#0 8.799 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.112.Final/netty-bom
-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.112.Final/netty-bom-4.1.112.F
inal.pom (14 kB at 241 kB/s)
#0 8.858 Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7
.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom (4.8
kB at 112 kB/s)
#0 8.905 Downloading from central: https://repo.maven.apache.org/maven2/com/squareup/okhttp3/okhttp-bom/4.12.0/okh
ttp-bom-4.12.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/squareup/okhttp3/okhttp-bom/4.12.0/okhttp-bom-4.
12.0.pom (3.1 kB at 78 kB/s)
#0 8.957 Downloading from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.37.0/
opentelemetry-bom-1.37.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.37.0/openteleme
try-bom-1.37.0.pom (5.7 kB at 89 kB/s)
#0 9.018 Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/prometheus-metrics-bom/1.2.1
/prometheus-metrics-bom-1.2.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/prometheus-metrics-bom/1.2.1/prometheu
s-metrics-bom-1.2.1.pom (6.1 kB at 138 kB/s)
#0 9.066 Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/client_java/1.2.1/client_jav
a-1.2.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/client_java/1.2.1/client_java-1.2.1.po
m (13 kB at 250 kB/s)
#0 9.122 Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/simpleclient_bom/0.16.0/simp
leclient_bom-0.16.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/simpleclient_bom/0.16.0/simpleclient_b
om-0.16.0.pom (6.0 kB at 134 kB/s)
#0 9.170 Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/parent/0.16.0/parent-0.16.0.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/parent/0.16.0/parent-0.16.0.pom (13 kB
 at 272 kB/s)
#0 9.220 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/pulsar/pulsar-bom/3.2.4/pulsar-
bom-3.2.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/pulsar/pulsar-bom/3.2.4/pulsar-bom-3.2.4.
pom (26 kB at 519 kB/s)
#0 9.272 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom (21 kB at 423 kB/
s)
#0 9.330 Downloading from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.1.0/querydsl-b
om-5.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.1.0/querydsl-bom-5.1.0.p
om (7.2 kB at 135 kB/s)
#0 9.386 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2023.0.9/rea
ctor-bom-2023.0.9.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2023.0.9/reactor-bom-2
023.0.9.pom (4.8 kB at 102 kB/s)
#0 9.436 Downloading from central: https://repo.maven.apache.org/maven2/io/rest-assured/rest-assured-bom/5.4.0/res
t-assured-bom-5.4.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/rest-assured/rest-assured-bom/5.4.0/rest-assured-
bom-5.4.0.pom (4.5 kB at 125 kB/s)
#0 9.475 Downloading from central: https://repo.maven.apache.org/maven2/io/rsocket/rsocket-bom/1.1.3/rsocket-bom-1
.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/rsocket/rsocket-bom/1.1.3/rsocket-bom-1.1.3.pom (
2.6 kB at 59 kB/s)
#0 9.523 Downloading from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.19.
1/selenium-bom-4.19.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.19.1/selenium
-bom-4.19.1.pom (6.0 kB at 116 kB/s)
#0 9.583 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3
.1.7/spring-amqp-bom-3.1.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3.1.7/sprin
g-amqp-bom-3.1.7.pom (3.9 kB at 81 kB/s)
#0 9.631 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom
/5.1.2/spring-batch-bom-5.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom/5.1.2/spr
ing-batch-bom-5.1.2.pom (3.2 kB at 105 kB/s)
#0 9.665 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2
024.0.3/spring-data-bom-2024.0.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2024.0.3/sp
ring-data-bom-2024.0.3.pom (5.5 kB at 157 kB/s)
#0 9.702 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6
.1.12/spring-framework-bom-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.1.12/spri
ng-framework-bom-6.1.12.pom (5.8 kB at 172 kB/s)
#0 9.741 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-int
egration-bom/6.3.3/spring-integration-bom-6.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-b
om/6.3.3/spring-integration-bom-6.3.3.pom (10 kB at 278 kB/s)
#0 9.781 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-b
om/1.1.3/spring-pulsar-bom-1.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-bom/1.1.3/s
pring-pulsar-bom-1.1.3.pom (2.9 kB at 77 kB/s)
#0 9.822 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/restdocs/spring-restdo
cs-bom/3.0.1/spring-restdocs-bom-3.0.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/restdocs/spring-restdocs-bom/3.0
.1/spring-restdocs-bom-3.0.1.pom (2.6 kB at 78 kB/s)
#0 9.857 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-securi
ty-bom/6.3.3/spring-security-bom-6.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/6.3
.3/spring-security-bom-6.3.3.pom (5.3 kB at 140 kB/s)
#0 9.900 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session
-bom/3.3.2/spring-session-bom-3.3.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/3.3.2
/spring-session-bom-3.3.2.pom (2.9 kB at 66 kB/s)
#0 9.946 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/4.0.1
1/spring-ws-bom-4.0.11.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/4.0.11/spring-w
s-bom-4.0.11.pom (3.5 kB at 95 kB/s)
#0 9.988 Downloading from central: https://repo.maven.apache.org/maven2/org/testcontainers/testcontainers-bom/1.19
.8/testcontainers-bom-1.19.8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/testcontainers/testcontainers-bom/1.19.8/testcon
tainers-bom-1.19.8.pom (10 kB at 227 kB/s)
#0 10.08 [INFO]
#0 10.08 [INFO] --------------------< com.example:gateway-service >---------------------
#0 10.08 [INFO] Building gateway-service 0.0.1-SNAPSHOT
#0 10.08 [INFO]   from pom.xml
#0 10.08 [INFO] --------------------------------[ jar ]---------------------------------
#0 10.09 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven
-plugin/3.3.3/spring-boot-maven-plugin-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.
3.3/spring-boot-maven-plugin-3.3.3.pom (4.0 kB at 89 kB/s)
#0 10.15 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven
-plugin/3.3.3/spring-boot-maven-plugin-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.
3.3/spring-boot-maven-plugin-3.3.3.jar (137 kB at 2.1 MB/s)
#0 10.23 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugi
n/3.3.2/maven-clean-plugin-3.3.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.3.2/ma
ven-clean-plugin-3.3.2.pom (5.3 kB at 133 kB/s)
#0 10.28 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/40/
maven-plugins-40.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/40/maven-plug
ins-40.pom (8.1 kB at 144 kB/s)
#0 10.35 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/40/maven-par
ent-40.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/40/maven-parent-40.pom
 (49 kB at 597 kB/s)
#0 10.44 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom (23 kB at 423 kB/
s)
#0 10.51 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugi
n/3.3.2/maven-clean-plugin-3.3.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.3.2/ma
ven-clean-plugin-3.3.2.jar (36 kB at 954 kB/s)
#0 10.56 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-p
lugin/3.3.1/maven-resources-plugin-3.3.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.
1/maven-resources-plugin-3.3.1.pom (8.2 kB at 177 kB/s)
#0 10.61 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/
maven-plugins-39.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/maven-plug
ins-39.pom (8.1 kB at 156 kB/s)
#0 10.67 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-par
ent-39.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom
 (48 kB at 1.1 MB/s)
#0 10.72 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-p
lugin/3.3.1/maven-resources-plugin-3.3.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.
1/maven-resources-plugin-3.3.1.jar (31 kB at 491 kB/s)
#0 10.79 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-pl
ugin/3.13.0/maven-compiler-plugin-3.13.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.13.
0/maven-compiler-plugin-3.13.0.pom (10 kB at 222 kB/s)
#0 10.85 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/41/
maven-plugins-41.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/41/maven-plug
ins-41.pom (7.4 kB at 167 kB/s)
#0 10.90 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-par
ent-41.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-parent-41.pom
 (50 kB at 924 kB/s)
#0 10.96 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-pl
ugin/3.13.0/maven-compiler-plugin-3.13.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.13.
0/maven-compiler-plugin-3.13.0.jar (83 kB at 1.3 MB/s)
#0 11.04 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-pl
ugin/3.2.5/maven-surefire-plugin-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5
/maven-surefire-plugin-3.2.5.pom (5.3 kB at 121 kB/s)
#0 11.09 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.2.5/s
urefire-3.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.2.5/surefire-3.
2.5.pom (22 kB at 379 kB/s)
#0 11.16 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.pom (5.6 k
B at 131 kB/s)
#0 11.21 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-pl
ugin/3.2.5/maven-surefire-plugin-3.2.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5
/maven-surefire-plugin-3.2.5.jar (45 kB at 969 kB/s)
#0 11.26 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/
3.4.2/maven-jar-plugin-3.4.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.2/mave
n-jar-plugin-3.4.2.pom (7.7 kB at 145 kB/s)
#0 11.32 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/
maven-plugins-42.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plug
ins-42.pom (7.7 kB at 171 kB/s)
#0 11.37 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-par
ent-42.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom
 (50 kB at 952 kB/s)
#0 11.43 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom (24 kB at 526 kB/
s)
#0 11.49 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.
2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.2.pom (5.6
 kB at 141 kB/s)
#0 11.53 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/
3.4.2/maven-jar-plugin-3.4.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.2/mave
n-jar-plugin-3.4.2.jar (34 kB at 577 kB/s)
#0 11.65 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er/3.3.3/spring-boot-starter-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.3.3/s
pring-boot-starter-3.3.3.pom (3.0 kB at 48 kB/s)
#0 11.73 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.3.3
/spring-boot-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.3.3/spring-bo
ot-3.3.3.pom (2.2 kB at 43 kB/s)
#0 11.78 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.12/spr
ing-core-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.12/spring-core-6
.1.12.pom (2.0 kB at 48 kB/s)
#0 11.83 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.1.12/spri
ng-jcl-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.1.12/spring-jcl-6.1
.12.pom (1.8 kB at 34 kB/s)
#0 11.89 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.12/
spring-context-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.12/spring-con
text-6.1.12.pom (2.8 kB at 68 kB/s)
#0 11.93 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.12/spri
ng-aop-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.12/spring-aop-6.1
.12.pom (2.2 kB at 58 kB/s)
#0 11.97 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.12/sp
ring-beans-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.12/spring-beans
-6.1.12.pom (2.0 kB at 38 kB/s)
#0 12.03 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.
12/spring-expression-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.12/spring-
expression-6.1.12.pom (2.1 kB at 55 kB/s)
#0 12.07 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.
3/micrometer-observation-1.13.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.3/micromet
er-observation-1.13.3.pom (3.8 kB at 104 kB/s)
#0 12.11 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.3/mi
crometer-commons-1.13.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.3/micrometer-c
ommons-1.13.3.pom (3.4 kB at 87 kB/s)
#0 12.15 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoc
onfigure/3.3.3/spring-boot-autoconfigure-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3
.3.3/spring-boot-autoconfigure-3.3.3.pom (2.1 kB at 48 kB/s)
#0 12.20 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-logging/3.3.3/spring-boot-starter-logging-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging
/3.3.3/spring-boot-starter-logging-3.3.3.pom (2.5 kB at 61 kB/s)
#0 12.24 Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.7/logba
ck-classic-1.5.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.7/logback-classic
-1.5.7.pom (13 kB at 284 kB/s)
#0 12.29 Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.5.7/logbac
k-parent-1.5.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.5.7/logback-parent-1
.5.7.pom (19 kB at 361 kB/s)
#0 12.35 Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.7/logback-
core-1.5.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.7/logback-core-1.5.7
.pom (7.9 kB at 227 kB/s)
#0 12.40 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.1
6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.pom (2.8
 kB at 55 kB/s)
#0 12.45 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/2.0.16/slf4j-parent
-2.0.16.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/2.0.16/slf4j-parent-2.0.16.po
m (13 kB at 352 kB/s)
#0 12.49 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-bom/2.0.16/slf4j-bom-2.0.1
6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-bom/2.0.16/slf4j-bom-2.0.16.pom (7.3
 kB at 150 kB/s)
#0 12.55 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.
23.1/log4j-to-slf4j-2.23.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.23.1/log4j
-to-slf4j-2.23.1.pom (4.4 kB at 84 kB/s)
#0 12.61 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.23.1/log4
j-2.23.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.23.1/log4j-2.23.1.p
om (37 kB at 783 kB/s)
#0 12.67 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-bom/3.0.21/groo
vy-bom-3.0.21.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-bom/3.0.21/groovy-bom-3.0
.21.pom (26 kB at 562 kB/s)
#0 12.72 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.16.1/j
ackson-bom-2.16.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.16.1/jackson-bom
-2.16.1.pom (18 kB at 304 kB/s)
#0 12.78 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.16/
jackson-parent-2.16.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.16/jackson-pa
rent-2.16.pom (6.5 kB at 142 kB/s)
#0 12.85 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/56/oss-parent-56.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/56/oss-parent-56.pom (24 kB
 at 501 kB/s)
#0 12.92 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakarta.jakartaee-bom/9.1
.0/jakarta.jakartaee-bom-9.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakarta.jakartaee-bom/9.1.0/jakarta
.jakartaee-bom-9.1.0.pom (9.6 kB at 212 kB/s)
#0 12.98 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakartaee-api-parent/9.1.
0/jakartaee-api-parent-9.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakartaee-api-parent/9.1.0/jakartae
e-api-parent-9.1.0.pom (15 kB at 225 kB/s)
#0 13.05 Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.7/project-1.0
.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.7/project-1.0.7.pom (14
 kB at 263 kB/s)
#0 13.12 Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/9.4.54.v202402
08/jetty-bom-9.4.54.v20240208.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/9.4.54.v20240208/jetty-b
om-9.4.54.v20240208.pom (18 kB at 327 kB/s)
#0 13.18 Downloading from central: https://repo.maven.apache.org/maven2/io/fabric8/kubernetes-client-bom/5.12.4/ku
bernetes-client-bom-5.12.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/fabric8/kubernetes-client-bom/5.12.4/kubernetes-c
lient-bom-5.12.4.pom (26 kB at 693 kB/s)
#0 13.22 Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/4.11.0/mockito-bom
-4.11.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/4.11.0/mockito-bom-4.11.0.po
m (3.2 kB at 81 kB/s)
#0 13.26 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.107.Final/netty-bom
-4.1.107.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.107.Final/netty-bom-4.1.107.F
inal.pom (14 kB at 335 kB/s)
#0 13.30 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/5
.3.32/spring-framework-bom-5.3.32.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/5.3.32/spri
ng-framework-bom-5.3.32.pom (5.7 kB at 138 kB/s)
#0 13.35 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/
log4j-api-2.23.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/log4j-api-
2.23.1.pom (3.8 kB at 91 kB/s)
#0 13.41 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j
-2.0.16.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.po
m (1.1 kB at 31 kB/s)
#0 13.44 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/
2.1.1/jakarta.annotation-api-2.1.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/2.1.1/jaka
rta.annotation-api-2.1.1.pom (16 kB at 367 kB/s)
#0 13.49 Downloading from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.2/snakeyaml-2.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.2/snakeyaml-2.2.pom (21 kB at 4
83 kB/s)
#0 13.54 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-sta
rter-gateway/4.1.5/spring-cloud-starter-gateway-4.1.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-starter-gatew
ay/4.1.5/spring-cloud-starter-gateway-4.1.5.pom (2.6 kB at 80 kB/s)
#0 13.57 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gat
eway/4.1.5/spring-cloud-gateway-4.1.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gateway/4.1.5
/spring-cloud-gateway-4.1.5.pom (2.7 kB at 68 kB/s)
#0 13.61 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-bui
ld/4.1.3/spring-cloud-build-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-build/4.1.3/s
pring-cloud-build-4.1.3.pom (50 kB at 1.2 MB/s)
#0 13.66 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-bui
ld-dependencies/4.1.3/spring-cloud-build-dependencies-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-build-depende
ncies/4.1.3/spring-cloud-build-dependencies-4.1.3.pom (2.9 kB at 43 kB/s)
#0 13.74 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-depen
dencies/3.2.7/spring-boot-dependencies-3.2.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/3.
2.7/spring-boot-dependencies-3.2.7.pom (116 kB at 2.6 MB/s)
#0 13.78 Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.24.2/assertj-bom
-3.24.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.24.2/assertj-bom-3.24.2.po
m (3.7 kB at 79 kB/s)
#0 13.83 Downloading from central: https://repo.maven.apache.org/maven2/io/zipkin/brave/brave-bom/5.16.0/brave-bom
-5.16.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/zipkin/brave/brave-bom/5.16.0/brave-bom-5.16.0.po
m (12 kB at 312 kB/s)
#0 13.87 Downloading from central: https://repo.maven.apache.org/maven2/io/zipkin/reporter2/zipkin-reporter-bom/2.
16.3/zipkin-reporter-bom-2.16.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/zipkin/reporter2/zipkin-reporter-bom/2.16.3/zipki
n-reporter-bom-2.16.3.pom (6.9 kB at 172 kB/s)
#0 13.92 Downloading from central: https://repo.maven.apache.org/maven2/com/datastax/oss/java-driver-bom/4.17.0/ja
va-driver-bom-4.17.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/datastax/oss/java-driver-bom/4.17.0/java-driver-
bom-4.17.0.pom (4.1 kB at 94 kB/s)
#0 13.97 Downloading from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-bom/4.2.26/m
etrics-bom-4.2.26.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-bom/4.2.26/metrics-bom
-4.2.26.pom (8.4 kB at 196 kB/s)
#0 14.01 Downloading from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-parent/4.2.2
6/metrics-parent-4.2.26.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/dropwizard/metrics/metrics-parent/4.2.26/metrics-
parent-4.2.26.pom (21 kB at 403 kB/s)
#0 14.07 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.21/groovy
-bom-4.0.21.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.21/groovy-bom-4.0.2
1.pom (27 kB at 718 kB/s)
#0 14.12 Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/14.0.29.Fina
l/infinispan-bom-14.0.29.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/14.0.29.Final/infinisp
an-bom-14.0.29.Final.pom (25 kB at 396 kB/s)
#0 14.18 Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configurat
ion-parent/14.0.29.Final/infinispan-build-configuration-parent-14.0.29.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent
/14.0.29.Final/infinispan-build-configuration-parent-14.0.29.Final.pom (24 kB at 549 kB/s)
#0 14.23 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/39/jboss-parent-39.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/39/jboss-parent-39.pom (68 kB
 at 1.7 MB/s)
#0 14.27 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.15.4/j
ackson-bom-2.15.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.15.4/jackson-bom
-2.15.4.pom (18 kB at 439 kB/s)
#0 14.32 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.15/
jackson-parent-2.15.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.15/jackson-pa
rent-2.15.pom (6.5 kB at 121 kB/s)
#0 14.37 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/50/oss-parent-50.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/50/oss-parent-50.pom (24 kB
 at 454 kB/s)
#0 14.43 Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.7/jers
ey-bom-3.1.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.7/jersey-bom-3.1
.7.pom (21 kB at 507 kB/s)
#0 14.47 Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0
.10/jetty-ee10-bom-12.0.10.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0.10/jetty-
ee10-bom-12.0.10.pom (9.3 kB at 215 kB/s)
#0 14.52 Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.0.10/jetty-
bom-12.0.10.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.0.10/jetty-bom-12.0.1
0.pom (14 kB at 295 kB/s)
#0 14.57 Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.9.24/kot
lin-bom-1.9.24.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.9.24/kotlin-bom-1.
9.24.pom (9.1 kB at 179 kB/s)
#0 14.63 Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-b
om/1.7.3/kotlinx-coroutines-bom-1.7.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.7.3/k
otlinx-coroutines-bom-1.7.3.pom (4.3 kB at 116 kB/s)
#0 14.67 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.21.1/
log4j-bom-2.21.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.21.1/log4j-bom-
2.21.1.pom (12 kB at 239 kB/s)
#0 14.72 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/logging-parent/10.1.1/l
ogging-parent-10.1.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/logging-parent/10.1.1/logging-par
ent-10.1.1.pom (39 kB at 739 kB/s)
#0 14.78 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.12.7/microm
eter-bom-1.12.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.12.7/micrometer-bom-1
.12.7.pom (7.9 kB at 152 kB/s)
#0 14.84 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.2.7
/micrometer-tracing-bom-1.2.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.2.7/micromete
r-tracing-bom-1.2.7.pom (4.5 kB at 116 kB/s)
#0 14.88 Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.7.0/mockito-bom-
5.7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.7.0/mockito-bom-5.7.0.pom
(3.0 kB at 80 kB/s)
#0 14.92 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.111.Final/netty-bom
-4.1.111.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.111.Final/netty-bom-4.1.111.F
inal.pom (14 kB at 327 kB/s)
#0 14.97 Downloading from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.31.0/
opentelemetry-bom-1.31.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.31.0/openteleme
try-bom-1.31.0.pom (7.0 kB at 148 kB/s)
#0 15.02 Downloading from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.0.0/querydsl-b
om-5.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.0.0/querydsl-bom-5.0.0.p
om (7.2 kB at 188 kB/s)
#0 15.06 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2023.0.7/rea
ctor-bom-2023.0.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2023.0.7/reactor-bom-2
023.0.7.pom (4.8 kB at 95 kB/s)
#0 15.11 Downloading from central: https://repo.maven.apache.org/maven2/io/rest-assured/rest-assured-bom/5.3.2/res
t-assured-bom-5.3.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/rest-assured/rest-assured-bom/5.3.2/rest-assured-
bom-5.3.2.pom (4.3 kB at 112 kB/s)
#0 15.15 Downloading from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.14.
1/selenium-bom-4.14.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.14.1/selenium
-bom-4.14.1.pom (6.0 kB at 126 kB/s)
#0 15.20 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3
.1.6/spring-amqp-bom-3.1.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3.1.6/sprin
g-amqp-bom-3.1.6.pom (3.9 kB at 105 kB/s)
#0 15.24 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2
023.1.7/spring-data-bom-2023.1.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2023.1.7/sp
ring-data-bom-2023.1.7.pom (5.5 kB at 138 kB/s)
#0 15.28 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6
.1.10/spring-framework-bom-6.1.10.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.1.10/spri
ng-framework-bom-6.1.10.pom (5.8 kB at 154 kB/s)
#0 15.33 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-int
egration-bom/6.2.6/spring-integration-bom-6.2.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-b
om/6.2.6/spring-integration-bom-6.2.6.pom (10 kB at 169 kB/s)
#0 15.39 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-b
om/1.0.7/spring-pulsar-bom-1.0.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-bom/1.0.7/s
pring-pulsar-bom-1.0.7.pom (2.7 kB at 64 kB/s)
#0 15.44 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-securi
ty-bom/6.2.5/spring-security-bom-6.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/6.2
.5/spring-security-bom-6.2.5.pom (5.3 kB at 103 kB/s)
#0 15.49 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session
-bom/3.2.4/spring-session-bom-3.2.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/3.2.4
/spring-session-bom-3.2.4.pom (2.9 kB at 85 kB/s)
#0 15.53 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-sta
rter/4.1.4/spring-cloud-starter-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-starter/4.1.4
/spring-cloud-starter-4.1.4.pom (5.0 kB at 138 kB/s)
#0 15.57 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-com
mons-parent/4.1.4/spring-cloud-commons-parent-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-commons-paren
t/4.1.4/spring-cloud-commons-parent-4.1.4.pom (4.5 kB at 112 kB/s)
#0 15.62 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-con
text/4.1.4/spring-cloud-context-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-context/4.1.4
/spring-cloud-context-4.1.4.pom (6.3 kB at 184 kB/s)
#0 15.66 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-securi
ty-crypto/6.3.3/spring-security-crypto-6.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-crypto/
6.3.3/spring-security-crypto-6.3.3.pom (1.9 kB at 38 kB/s)
#0 15.71 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-com
mons/4.1.4/spring-cloud-commons-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-commons/4.1.4
/spring-cloud-commons-4.1.4.pom (7.3 kB at 160 kB/s)
#0 15.77 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-securi
ty-rsa/1.1.3/spring-security-rsa-1.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-rsa/1.1
.3/spring-security-rsa-1.1.3.pom (5.4 kB at 135 kB/s)
#0 15.81 Downloading from central: https://repo.maven.apache.org/maven2/org/bouncycastle/bcprov-jdk18on/1.78/bcpro
v-jdk18on-1.78.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/bouncycastle/bcprov-jdk18on/1.78/bcprov-jdk18on-
1.78.pom (1.1 kB at 27 kB/s)
#0 15.86 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gat
eway-server/4.1.5/spring-cloud-gateway-server-4.1.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gateway-serve
r/4.1.5/spring-cloud-gateway-server-4.1.5.pom (7.0 kB at 180 kB/s)
#0 15.90 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-validation/3.3.3/spring-boot-starter-validation-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validat
ion/3.3.3/spring-boot-starter-validation-3.3.3.pom (2.5 kB at 57 kB/s)
#0 15.95 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10
.1.28/tomcat-embed-el-10.1.28.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10.1.28/tomc
at-embed-el-10.1.28.pom (1.5 kB at 36 kB/s)
#0 15.99 Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validato
r/8.0.1.Final/hibernate-validator-8.0.1.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator/8.0.1.Fi
nal/hibernate-validator-8.0.1.Final.pom (15 kB at 354 kB/s)
#0 16.04 Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validato
r-parent/8.0.1.Final/hibernate-validator-parent-8.0.1.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator-parent/8
.0.1.Final/hibernate-validator-parent-8.0.1.Final.pom (81 kB at 2.0 MB/s)
#0 16.09 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/arquillian/arquillian-bom/1.7.0.
Alpha10/arquillian-bom-1.7.0.Alpha10.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/arquillian/arquillian-bom/1.7.0.Alpha10/ar
quillian-bom-1.7.0.Alpha10.pom (10 kB at 221 kB/s)
#0 16.14 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.6/
shrinkwrap-bom-1.2.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.6/shrinkwrap
-bom-1.2.6.pom (4.0 kB at 105 kB/s)
#0 16.18 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/resolver/shrinkwrap-r
esolver-bom/3.1.4/shrinkwrap-resolver-bom-3.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bo
m/3.1.4/shrinkwrap-resolver-bom-3.1.4.pom (7.0 kB at 116 kB/s)
#0 16.25 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.6.3/maven-3.6.3.p
om
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.6.3/maven-3.6.3.pom (26 kB
at 562 kB/s)
#0 16.30 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-par
ent-33.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
 (44 kB at 883 kB/s)
#0 16.35 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom (17 kB at 305 kB/
s)
#0 16.41 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/descriptors/shrinkwra
p-descriptors-bom/2.0.0/shrinkwrap-descriptors-bom-2.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/descriptors/shrinkwrap-descript
ors-bom/2.0.0/shrinkwrap-descriptors-bom-2.0.0.pom (5.2 kB at 95 kB/s)
#0 16.47 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/validation/jakarta.validation-api/
3.0.2/jakarta.validation-api-3.0.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/validation/jakarta.validation-api/3.0.2/jaka
rta.validation-api-3.0.2.pom (11 kB at 256 kB/s)
#0 16.51 Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.6/project-1.0
.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.6/project-1.0.6.pom (13
 kB at 256 kB/s)
#0 16.57 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.5.3.Fina
l/jboss-logging-3.5.3.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.5.3.Final/jboss-lo
gging-3.5.3.Final.pom (19 kB at 477 kB/s)
#0 16.61 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/logging-parent/1.0.1.Fin
al/logging-parent-1.0.1.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/logging/logging-parent/1.0.1.Final/logging
-parent-1.0.1.Final.pom (6.0 kB at 138 kB/s)
#0 16.66 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.7.0/classmate-1.
7.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.7.0/classmate-1.7.0.pom (7
.0 kB at 150 kB/s)
#0 16.71 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/addons/reactor-extra/3.5
.2/reactor-extra-3.5.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/addons/reactor-extra/3.5.2/reactor
-extra-3.5.2.pom (2.0 kB at 52 kB/s)
#0 16.76 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.6.9/react
or-core-3.6.9.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.6.9/reactor-core-3.
6.9.pom (2.1 kB at 49 kB/s)
#0 16.80 Downloading from central: https://repo.maven.apache.org/maven2/org/reactivestreams/reactive-streams/1.0.4
/reactive-streams-1.0.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-
streams-1.0.4.pom (1.1 kB at 25 kB/s)
#0 16.85 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-webflux/3.3.3/spring-boot-starter-webflux-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-webflux
/3.3.3/spring-boot-starter-webflux-3.3.3.pom (2.9 kB at 75 kB/s)
#0 16.89 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-json/3.3.3/spring-boot-starter-json-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.
3.3/spring-boot-starter-json-3.3.3.pom (3.1 kB at 75 kB/s)
#0 16.93 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.12/spri
ng-web-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.12/spring-web-6.1
.12.pom (2.4 kB at 61 kB/s)
#0 16.98 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databin
d/2.17.2/jackson-databind-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.17.2/j
ackson-databind-2.17.2.pom (21 kB at 494 kB/s)
#0 17.02 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.17.2/
jackson-base-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.17.2/jackson-ba
se-2.17.2.pom (12 kB at 318 kB/s)
#0 17.06 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotat
ions/2.17.2/jackson-annotations-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.17.
2/jackson-annotations-2.17.2.pom (7.1 kB at 138 kB/s)
#0 17.13 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.
17.2/jackson-core-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.17.2/jacks
on-core-2.17.2.pom (9.6 kB at 235 kB/s)
#0 17.17 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-dat
atype-jdk8/2.17.2/jackson-datatype-jdk8-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8
/2.17.2/jackson-datatype-jdk8-2.17.2.pom (2.6 kB at 83 kB/s)
#0 17.20 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modul
es-java8/2.17.2/jackson-modules-java8-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2
.17.2/jackson-modules-java8-2.17.2.pom (3.1 kB at 77 kB/s)
#0 17.25 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-dat
atype-jsr310/2.17.2/jackson-datatype-jsr310-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr3
10/2.17.2/jackson-datatype-jsr310-2.17.2.pom (4.9 kB at 153 kB/s)
#0 17.28 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modul
e-parameter-names/2.17.2/jackson-module-parameter-names-2.17.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-paramete
r-names/2.17.2/jackson-module-parameter-names-2.17.2.pom (4.2 kB at 106 kB/s)
#0 17.33 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-reactor-netty/3.3.3/spring-boot-starter-reactor-netty-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-reactor
-netty/3.3.3/spring-boot-starter-reactor-netty-3.3.3.pom (2.1 kB at 42 kB/s)
#0 17.38 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http
/1.1.22/reactor-netty-http-1.1.22.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http/1.1.22/re
actor-netty-http-1.1.22.pom (4.3 kB at 102 kB/s)
#0 17.42 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.112.Final/ne
tty-codec-http-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.112.Final/netty-codec-
http-4.1.112.Final.pom (4.4 kB at 112 kB/s)
#0 17.47 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.1.112.Final/netty-
parent-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-parent/4.1.112.Final/netty-parent-4.1
.112.Final.pom (90 kB at 2.0 MB/s)
#0 17.52 Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9
.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom (6.6
kB at 146 kB/s)
#0 17.56 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.112.Final/netty-
common-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.112.Final/netty-common-4.1
.112.Final.pom (12 kB at 337 kB/s)
#0 17.61 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.112.Final/netty-
buffer-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.112.Final/netty-buffer-4.1
.112.Final.pom (1.6 kB at 33 kB/s)
#0 17.66 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.112.Final/net
ty-transport-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.112.Final/netty-transpo
rt-4.1.112.Final.pom (2.2 kB at 55 kB/s)
#0 17.70 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.112.Final/nett
y-resolver-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.112.Final/netty-resolver
-4.1.112.Final.pom (1.6 kB at 35 kB/s)
#0 17.76 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.112.Final/netty-c
odec-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.112.Final/netty-codec-4.1.1
12.Final.pom (5.5 kB at 148 kB/s)
#0 17.80 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.112.Final/netty
-handler-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.112.Final/netty-handler-4
.1.112.Final.pom (4.6 kB at 89 kB/s)
#0 17.85 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-commo
n/4.1.112.Final/netty-transport-native-unix-common-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-common/4.1.112.
Final/netty-transport-native-unix-common-4.1.112.Final.pom (33 kB at 807 kB/s)
#0 17.91 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.112.Final/n
etty-codec-http2-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.112.Final/netty-codec
-http2-4.1.112.Final.pom (5.2 kB at 120 kB/s)
#0 17.96 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.112.Final/
netty-resolver-dns-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.112.Final/netty-reso
lver-dns-4.1.112.Final.pom (3.7 kB at 85 kB/s)
#0 18.01 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.112.Final/net
ty-codec-dns-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.112.Final/netty-codec-d
ns-4.1.112.Final.pom (2.7 kB at 49 kB/s)
#0 18.07 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4
.1.112.Final/netty-resolver-dns-native-macos-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4.1.112.Fin
al/netty-resolver-dns-native-macos-4.1.112.Final.pom (18 kB at 438 kB/s)
#0 18.11 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/
4.1.112.Final/netty-resolver-dns-classes-macos-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/4.1.112.Fi
nal/netty-resolver-dns-classes-macos-4.1.112.Final.pom (2.0 kB at 54 kB/s)
#0 18.15 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.
112.Final/netty-transport-native-epoll-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.112.Final/
netty-transport-native-epoll-4.1.112.Final.pom (27 kB at 636 kB/s)
#0 18.20 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-classes-epoll/4.1
.112.Final/netty-transport-classes-epoll-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-classes-epoll/4.1.112.Final
/netty-transport-classes-epoll-4.1.112.Final.pom (2.1 kB at 50 kB/s)
#0 18.25 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-core
/1.1.22/reactor-netty-core-1.1.22.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-core/1.1.22/re
actor-netty-core-1.1.22.pom (3.9 kB at 89 kB/s)
#0 18.30 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.112.Final
/netty-handler-proxy-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.112.Final/netty-han
dler-proxy-4.1.112.Final.pom (3.6 kB at 72 kB/s)
#0 18.35 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.112.Final/n
etty-codec-socks-4.1.112.Final.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.112.Final/netty-codec
-socks-4.1.112.Final.pom (2.5 kB at 59 kB/s)
#0 18.40 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webflux/6.1.12/
spring-webflux-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webflux/6.1.12/spring-web
flux-6.1.12.pom (2.6 kB at 68 kB/s)
#0 18.44 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-sta
rter-netflix-eureka-client/4.1.3/spring-cloud-starter-netflix-eureka-client-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-starter-netfl
ix-eureka-client/4.1.3/spring-cloud-starter-netflix-eureka-client-4.1.3.pom (7.2 kB at 150 kB/s)
#0 18.49 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-net
flix/4.1.3/spring-cloud-netflix-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-netflix/4.1.3
/spring-cloud-netflix-4.1.3.pom (4.6 kB at 104 kB/s)
#0 18.54 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-net
flix-eureka-client/4.1.3/spring-cloud-netflix-eureka-client-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-netflix-eurek
a-client/4.1.3/spring-cloud-netflix-eureka-client-4.1.3.pom (8.6 kB at 162 kB/s)
#0 18.60 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-client/2.0.3/eur
eka-client-2.0.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-client/2.0.3/eureka-client
-2.0.3.pom (9.2 kB at 248 kB/s)
#0 18.64 Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/xstream/xstream/1.4.20/xs
tream-1.4.20.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/xstream/xstream/1.4.20/xstream-1.4.
20.pom (25 kB at 654 kB/s)
#0 18.68 Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/xstream/xstream-parent/1.
4.20/xstream-parent-1.4.20.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/xstream/xstream-parent/1.4.20/xstre
am-parent-1.4.20.pom (44 kB at 1.2 MB/s)
#0 18.72 Downloading from central: https://repo.maven.apache.org/maven2/io/github/x-stream/mxparser/1.2.2/mxparser
-1.2.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/x-stream/mxparser/1.2.2/mxparser-1.2.2.pom
 (24 kB at 507 kB/s)
#0 18.77 Downloading from central: https://repo.maven.apache.org/maven2/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.po
m
Downloaded from central: https://repo.maven.apache.org/maven2/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.pom (386 B a
t 11 kB/s)
#0 18.81 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/ws/rs/jakarta.ws.rs-api/3.1.0/jaka
rta.ws.rs-api-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/ws/rs/jakarta.ws.rs-api/3.1.0/jakarta.ws.rs-
api-3.1.0.pom (18 kB at 304 kB/s)
#0 18.87 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/ws/rs/all/3.1.0/all-3.1.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/ws/rs/all/3.1.0/all-3.1.0.pom (2.8 kB at 71
kB/s)
#0 18.91 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/ja
karta.inject-api-2.0.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inje
ct-api-2.0.1.pom (5.9 kB at 112 kB/s)
#0 18.97 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/spectator/spectator-api/1.7.3/
spectator-api-1.7.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/spectator/spectator-api/1.7.3/spectator-
api-1.7.3.pom (3.3 kB at 82 kB/s)
#0 19.02 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.3
/httpclient-4.5.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.3/httpclien
t-4.5.3.pom (6.4 kB at 168 kB/s)
#0 19.06 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-c
lient/4.5.3/httpcomponents-client-4.5.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-client/4.5.
3/httpcomponents-client-4.5.3.pom (16 kB at 402 kB/s)
#0 19.11 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/project/7/projec
t-7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/project/7/project-7.pom (2
7 kB at 681 kB/s)
#0 19.15 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom (14 kB at 333 kB/
s)
#0 19.20 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.16/
httpcore-4.4.16.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.16/httpcore-4
.4.16.pom (5.0 kB at 97 kB/s)
#0 19.25 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-c
ore/4.4.16/httpcomponents-core-4.4.16.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-core/4.4.16
/httpcomponents-core-4.4.16.pom (12 kB at 239 kB/s)
#0 19.30 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-p
arent/11/httpcomponents-parent-11.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/11/h
ttpcomponents-parent-11.pom (35 kB at 789 kB/s)
#0 19.35 Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons
-codec-1.16.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.1
6.1.pom (16 kB at 461 kB/s)
#0 19.39 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commo
ns-parent-66.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commons-parent-
66.pom (77 kB at 1.6 MB/s)
#0 19.44 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.
1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.1.pom (5.6
 kB at 149 kB/s)
#0 19.48 Downloading from central: https://repo.maven.apache.org/maven2/commons-configuration/commons-configuratio
n/1.10/commons-configuration-1.10.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-configuration/commons-configuration/1.10/com
mons-configuration-1.10.pom (21 kB at 482 kB/s)
#0 19.53 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/32/commo
ns-parent-32.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/32/commons-parent-
32.pom (53 kB at 1.2 MB/s)
#0 19.57 Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.6/commons-lang
-2.6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.6/commons-lang-2.6.pom (
17 kB at 398 kB/s)
#0 19.62 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/17/commo
ns-parent-17.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/17/commons-parent-
17.pom (31 kB at 821 kB/s)
#0 19.66 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/7/apache-7.pom (14 kB at 424 kB/s)
#0 19.70 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-eventb
us/0.3.0/netflix-eventbus-0.3.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-eventbus/0.3.0/n
etflix-eventbus-0.3.0.pom (3.5 kB at 85 kB/s)
#0 19.74 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-infix/
0.3.0/netflix-infix-0.3.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-infix/0.3.0/netf
lix-infix-0.3.0.pom (3.9 kB at 116 kB/s)
#0 19.77 Downloading from central: https://repo.maven.apache.org/maven2/commons-jxpath/commons-jxpath/1.3/commons-
jxpath-1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-jxpath/commons-jxpath/1.3/commons-jxpath-1.3
.pom (9.2 kB at 296 kB/s)
#0 19.81 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/11/commo
ns-parent-11.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/11/commons-parent-
11.pom (25 kB at 616 kB/s)
#0 19.85 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/4/apache-4.pom (4.5 kB at 112 kB/s
)
#0 19.89 Downloading from central: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.3/joda-time-2.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.3/joda-time-2.3.pom (25 kB at
680 kB/s)
#0 19.93 Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr-runtime/3.4/antlr-runtime-
3.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr-runtime/3.4/antlr-runtime-3.4.pom (3
.1 kB at 71 kB/s)
#0 19.98 Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr-master/3.4/antlr-master-3.
4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr-master/3.4/antlr-master-3.4.pom (9.4
 kB at 276 kB/s)
#0 20.02 Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/stringtemplate/3.2.1/stringtempl
ate-3.2.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/stringtemplate/3.2.1/stringtemplate-3.2.1.
pom (7.5 kB at 178 kB/s)
#0 20.06 Downloading from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.pom (632 B at 19 kB/s)
#0 20.10 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/14.0.1/guava-14.0.1
.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/14.0.1/guava-14.0.1.pom (5.4
kB at 117 kB/s)
#0 20.15 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/14.0.1/guava
-parent-14.0.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/14.0.1/guava-parent-14
.0.1.pom (2.6 kB at 75 kB/s)
#0 20.19 Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10
.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.1.pom (9.
4 kB at 223 kB/s)
#0 20.23 Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson-parent/2.10.1/gs
on-parent-2.10.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson-parent/2.10.1/gson-parent-
2.10.1.pom (13 kB at 298 kB/s)
#0 20.27 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/servo/servo-core/0.5.3/servo-c
ore-0.5.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/servo/servo-core/0.5.3/servo-core-0.5.3.
pom (2.3 kB at 40 kB/s)
#0 20.34 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-math/2.2/common
s-math-2.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-math/2.2/commons-math-2.2
.pom (11 kB at 162 kB/s)
#0 20.41 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/18/commo
ns-parent-18.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/18/commons-parent-
18.pom (34 kB at 838 kB/s)
#0 20.46 Downloading from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/
javax.annotation-api-1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.anno
tation-api-1.2.pom (13 kB at 395 kB/s)
#0 20.49 Downloading from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom (4.8 kB a
t 123 kB/s)
#0 20.53 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/jettison/jettison/1.5.4/jetti
son-1.5.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/jettison/jettison/1.5.4/jettison-1.5.4.
pom (7.8 kB at 160 kB/s)
#0 20.59 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclie
nt5/5.3.1/httpclient5-5.3.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.3.1/
httpclient5-5.3.1.pom (6.0 kB at 124 kB/s)
#0 20.64 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclie
nt5-parent/5.3.1/httpclient5-parent-5.3.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5-parent
/5.3.1/httpclient5-parent-5.3.1.pom (17 kB at 491 kB/s)
#0 20.68 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-p
arent/13/httpcomponents-parent-13.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/13/h
ttpcomponents-parent-13.pom (30 kB at 657 kB/s)
#0 20.72 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom (20 kB at 617 kB/
s)
#0 20.76 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/
5.2.5/httpcore5-5.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.2.5/http
core5-5.2.5.pom (3.9 kB at 99 kB/s)
#0 20.80 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-
parent/5.2.5/httpcore5-parent-5.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-parent/5.2
.5/httpcore5-parent-5.2.5.pom (14 kB at 292 kB/s)
#0 20.85 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-
h2/5.2.5/httpcore5-h2-5.2.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.2.5/h
ttpcore5-h2-5.2.5.pom (3.6 kB at 93 kB/s)
#0 20.90 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-core/2.0.3/eurek
a-core-2.0.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-core/2.0.3/eureka-core-2.0
.3.pom (5.4 kB at 131 kB/s)
#0 20.94 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/woodstox/woodstox-core/6.2.1
/woodstox-core-6.2.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/woodstox/woodstox-core/6.2.1/woodstox-
core-6.2.1.pom (8.3 kB at 223 kB/s)
#0 20.98 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/38/oss-parent-38.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/38/oss-parent-38.pom (23 kB
 at 591 kB/s)
#0 21.02 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/woodstox/stax2-api/4.2.1/stax
2-api-4.2.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/woodstox/stax2-api/4.2.1/stax2-api-4.2.
1.pom (6.3 kB at 140 kB/s)
#0 21.07 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/33.0.0-jre/guava-33
.0.0-jre.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/33.0.0-jre/guava-33.0.0-jre.p
om (13 kB at 339 kB/s)
#0 21.11 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/33.0.0-jre/g
uava-parent-33.0.0-jre.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/33.0.0-jre/guava-paren
t-33.0.0-jre.pom (19 kB at 602 kB/s)
#0 21.14 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.2/failu
reaccess-1.0.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.2/failureaccess-1
.0.2.pom (3.3 kB at 95 kB/s)
#0 21.18 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/26.0-android
/guava-parent-26.0-android.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/26.0-android/guava-par
ent-26.0-android.pom (10 kB at 299 kB/s)
#0 21.22 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-e
mpty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-av
oid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.pom (2.3 kB at 32 kB/s)
#0 21.29 Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.41.0/c
hecker-qual-3.41.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.41.0/checker-qua
l-3.41.0.pom (2.1 kB at 54 kB/s)
#0 21.33 Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotati
ons/2.23.0/error_prone_annotations-2.23.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.23.0
/error_prone_annotations-2.23.0.pom (1.8 kB at 48 kB/s)
#0 21.37 Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2
.23.0/error_prone_parent-2.23.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_parent/2.23.0/erro
r_prone_parent-2.23.0.pom (13 kB at 298 kB/s)
#0 21.42 Downloading from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/2.8/j
2objc-annotations-2.8.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/2.8/j2objc-anno
tations-2.8.pom (2.9 kB at 70 kB/s)
#0 21.46 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-sta
rter-loadbalancer/4.1.4/spring-cloud-starter-loadbalancer-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-starter-loadb
alancer/4.1.4/spring-cloud-starter-loadbalancer-4.1.4.pom (4.5 kB at 81 kB/s)
#0 21.52 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-loa
dbalancer/4.1.4/spring-cloud-loadbalancer-4.1.4.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-loadbalancer/
4.1.4/spring-cloud-loadbalancer-4.1.4.pom (6.9 kB at 187 kB/s)
#0 21.56 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-cache/3.3.3/spring-boot-starter-cache-3.3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-cache/3
.3.3/spring-boot-starter-cache-3.3.3.pom (2.3 kB at 27 kB/s)
#0 21.65 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context-support
/6.1.12/spring-context-support-6.1.12.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context-support/6.1.12/sp
ring-context-support-6.1.12.pom (2.4 kB at 41 kB/s)
#0 21.71 Downloading from central: https://repo.maven.apache.org/maven2/com/stoyanr/evictor/1.0.0/evictor-1.0.0.po
m
Downloaded from central: https://repo.maven.apache.org/maven2/com/stoyanr/evictor/1.0.0/evictor-1.0.0.pom (7.8 kB
at 159 kB/s)
#0 21.77 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
[+] Building 57.6s (11/13)
#0 22.24 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/
2.1.3/jakarta.activation-api-2.1.3.pom (5.1 kB at 140 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.3/jaka
rta.activation-api-2.1.3.pom (19 kB at 452 kB/s)
#0 22.28 Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-co
re-3.25.3.pom3.3.3.pom (2.2 kB at 50 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-core-3.25.3.
pom (3.8 kB at 75 kB/s)
#0 22.34 Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-budd
y-1.14.19.pom1 kB at 56 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-buddy-1.14.19.
pom (16 kB at 325 kB/s)ing-boot-test-autoconfigure-3.3.3.pom
#0 22.39 Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.14.19/by
te-buddy-parent-1.14.19.pomautoconfigure-3.3.3.pom (2.5 kB at 71 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.14.19/byte-buddy-p
arent-1.14.19.pom (62 kB at 1.7 MB/s)
#0 22.43 Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility
-4.2.2.pomB at 53 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.pom
 (3.5 kB at 74 kB/s)
#0 22.48 Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility-parent/4.2.2/awa
itility-parent-4.2.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility-parent/4.2.2/awaitility-pa
rent-4.2.2.pom (11 kB at 247 kB/s)
#0 22.53 Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.pom (1.1 kB a
t 26 kB/s)ownloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.6/asm-9.6.pom
#0 22.57 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/jun
it-jupiter-5.10.3.pomfrom central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5.1/ow2-1.5.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/junit-jupiter
-5.10.3.pom (3.2 kB at 63 kB/s)al: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.
#0 22.63 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3
/junit-jupiter-api-5.10.3.poms://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.2/jakarta.
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3/junit-jup
iter-api-5.10.3.pom (3.2 kB at 84 kB/s)s://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api-pare
#0 22.67 Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j
-1.3.0.pom from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api-parent/4.0.2/j
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.pom
 (2.0 kB at 54 kB/s)
#0 22.71 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/
1.10.3/junit-platform-commons-1.10.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.10.3/jun
it-platform-commons-1.10.3.pom (2.8 kB at 53 kB/s)
#0 22.76 Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apig
uardian-api-1.1.2.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-ap
i-1.1.2.pom (1.5 kB at 27 kB/s)
#0 22.82 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.1
0.3/junit-jupiter-params-5.10.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.10.3/junit-
jupiter-params-5.10.3.pom (3.0 kB at 77 kB/s)
#0 22.87 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.1
0.3/junit-jupiter-engine-5.10.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.10.3/junit-
jupiter-engine-5.10.3.pom (3.2 kB at 89 kB/s)
#0 22.91 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1
.10.3/junit-platform-engine-1.10.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.10.3/juni
t-platform-engine-1.10.3.pom (3.2 kB at 71 kB/s)
#0 22.95 Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-co
re-5.11.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-core-5.11.0.
pom (2.5 kB at 71 kB/s)
#0 22.99 Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byt
e-buddy-agent-1.14.19.pom
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byte-buddy-ag
ent-1.14.19.pom (10 kB at 262 kB/s)
#0 23.04 Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.pom (3.0 k
B at 48 kB/s)
#0 23.10 Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/3.3/objenes
is-parent-3.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/3.3/objenesis-parent-
3.3.pom (19 kB at 319 kB/s)
#0 23.17 Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/m
ockito-junit-jupiter-5.11.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/mockito-jun
it-jupiter-5.11.0.pom (2.3 kB at 39 kB/s)
#0 23.23 Downloading from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonasser
t-1.5.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.po
m (7.0 kB at 189 kB/s)
#0 23.27 Downloading from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.
0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108
.vaadin1/android-json-0.0.20131108.vaadin1.pom (2.8 kB at 70 kB/s)
#0 23.31 Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-cor
e-2.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-core-2.9.1.po
m (2.4 kB at 61 kB/s)
#0 23.35 Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-parent/2.9.1/xmlunit-p
arent-2.9.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-parent/2.9.1/xmlunit-parent-2.9.
1.pom (21 kB at 433 kB/s)
#0 23.40 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-sta
rter-openfeign/4.1.3/spring-cloud-starter-openfeign-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-starter-openf
eign/4.1.3/spring-cloud-starter-openfeign-4.1.3.pom (5.1 kB at 113 kB/s)
#0 23.45 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-ope
nfeign/4.1.3/spring-cloud-openfeign-4.1.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-openfeign/4.1
.3/spring-cloud-openfeign-4.1.3.pom (4.6 kB at 106 kB/s)
#0 23.50 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-ope
nfeign-core/4.1.3/spring-cloud-openfeign-core-4.1.3.pom
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.8s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.6s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => [internal] load build context                                                                            0.2s
 => => transferring context: 1.86kB                                                                          0.1s
 => [build 3/5] COPY pom.xml .                                                                               0.1s
 => [build 4/5] COPY src ./src                                                                               0.1s
 => [build 5/5] RUN mvn clean package -DskipTests                                                           56.1s
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexu
 => => # s-xml-3.0.0.jar (93 kB at 738 kB/s)
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.
 => => # 3.jar (334 kB at 370 kB/s)
 => => # [INFO] Recompiling the module because of changed source code.
 => => # [INFO] Compiling 9 source files with javac [debug parameters release 21] to target/classes
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.7s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.9s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => [internal] load build context                                                                            0.2s
 => => transferring context: 7.33kB                                                                          0.2s
 => [build 3/5] COPY pom.xml .                                                                               0.1s
 => [build 4/5] COPY src ./src                                                                               0.1s
 => [build 5/5] RUN mvn clean package -DskipTests                                                           56.0s
 => => # Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.
 => => # 36.jar
 => => # Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.
 => => # 7/plexus-build-api-0.0.7.jar
 => => # Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-
 => => # 1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-openfeign-cor
e/4.1.3/spring-cloud-openfeign-core-4.1.3.pom (10 kB at 257 kB/s)
#0 23.54 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form-spring
/3.8.0/feign-form-spring-3.8.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form-spring/3.8.0/fei
gn-form-spring-3.8.0.pom (3.1 kB at 78 kB/s)
#0 23.59 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/parent/3.8.0/pare
nt-3.8.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/parent/3.8.0/parent-3.8.0.p
om (15 kB at 384 kB/s)
#0 23.64 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form/3.8.0/
feign-form-3.8.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form/3.8.0/feign-form
-3.8.0.pom (1.9 kB at 55 kB/s)
#0 23.67 Downloading from central: https://repo.maven.apache.org/maven2/commons-fileupload/commons-fileupload/1.5/
commons-fileupload-1.5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-fileupload/commons-fileupload/1.5/commons-fi
leupload-1.5.pom (16 kB at 306 kB/s)
#0 23.73 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/56/commo
ns-parent-56.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/56/commons-parent-
56.pom (82 kB at 1.6 MB/s)
#0 23.79 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.1/junit-bom-5.9.1.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.1/junit-bom-5.9.1.pom (5.6 k
B at 125 kB/s)
#0 23.84 Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.
11.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom (
20 kB at 493 kB/s)
#0 23.88 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commo
ns-parent-52.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-
52.pom (79 kB at 1.9 MB/s)
#0 23.92 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom (18 kB at 392 kB/
s)
#0 23.98 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom (5.1 k
B at 100 kB/s)
#0 24.04 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-core/13.3/feign-
core-13.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-core/13.3/feign-core-13.3.
pom (4.0 kB at 102 kB/s)
#0 24.08 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/parent/13.3/parent-13.
3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/parent/13.3/parent-13.3.pom (32
kB at 790 kB/s)
#0 24.12 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-slf4j/13.3/feign
-slf4j-13.3.pom
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-slf4j/13.3/feign-slf4j-13.
3.pom (1.9 kB at 52 kB/s)
#0 24.24 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er/3.3.3/spring-boot-starter-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.3.3/s
pring-boot-starter-3.3.3.jar (4.8 kB at 90 kB/s)
#0 24.29 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.3.3
/spring-boot-3.3.3.jar
#0 24.30 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.12/
spring-context-6.1.12.jar
#0 24.30 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.12/spri
ng-aop-6.1.12.jar
#0 24.30 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.
12/spring-expression-6.1.12.jar
#0 24.30 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoc
onfigure/3.3.3/spring-boot-autoconfigure-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.12/spring-con
text-6.1.12.jar (1.3 MB at 7.9 MB/s)
#0 24.46 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-logging/3.3.3/spring-boot-starter-logging-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging
/3.3.3/spring-boot-starter-logging-3.3.3.jar (4.8 kB at 22 kB/s)
#0 24.51 Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.7/logba
ck-classic-1.5.7.jar
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.7/logback-classic
-1.5.7.jar (296 kB at 965 kB/s)
#0 24.61 Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.7/logback-
core-1.5.7.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.12/spring-aop-6.1
.12.jar (417 kB at 1.2 MB/s)
#0 24.64 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.
23.1/log4j-to-slf4j-2.23.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.12/spring-
expression-6.1.12.jar (304 kB at 855 kB/s)
#0 24.65 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/
log4j-api-2.23.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.23.1/log4j
-to-slf4j-2.23.1.jar (23 kB at 48 kB/s)
#0 24.78 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j
-2.0.16.jar
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.7/logback-core-1.5.7
.jar (615 kB at 1.1 MB/s)
#0 24.84 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/
2.1.1/jakarta.annotation-api-2.1.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/log4j-api-
2.23.1.jar (343 kB at 568 kB/s)
#0 24.90 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.12/spr
ing-core-6.1.12.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.ja
r (6.4 kB at 10 kB/s)
#0 24.90 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.1.12/spri
ng-jcl-6.1.12.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3
.3.3/spring-boot-autoconfigure-3.3.3.jar (2.0 MB at 2.9 MB/s)
#0 24.98 Downloading from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.2/snakeyaml-2.2.jar
[+] Building 57.4s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0sa
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0so
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.7s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.5sa
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => [internal] load build context                                                                            0.0s1
 => => transferring context: 8.29kB                                                                          0.0s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0sn
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s4
 => [build 3/5] COPY pom.xml .                                                                               0.0s
 => [build 4/5] COPY src ./src                                                                               0.1s.
 => [build 5/5] RUN mvn clean package -DskipTests                                                           56.3s
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/w
 => => # 2.15.0/plexus-compiler-javac-2.15.0.jar (26 kB at 262 kB/s)
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexuo
 => => # s-xml-3.0.0.jar (93 kB at 823 kB/s)
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.
 => => # 3.jar (334 kB at 911 kB/s)
#0 25.08 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gat
eway-server/4.1.5/spring-cloud-gateway-server-4.1.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-context/4.1.4
/spring-cloud-context-4.1.4.jar (190 kB at 242 kB/s)
#0 25.09 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-validation/3.3.3/spring-boot-starter-validation-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-rsa/1.1
.3/spring-security-rsa-1.1.3.jar (20 kB at 25 kB/s)
#0 25.12 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10
.1.28/tomcat-embed-el-10.1.28.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validat
ion/3.3.3/spring-boot-starter-validation-3.3.3.jar (4.8 kB at 5.3 kB/s)
#0 25.21 Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validato
r/8.0.1.Final/hibernate-validator-8.0.1.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-gateway-serve
r/4.1.5/spring-cloud-gateway-server-4.1.5.jar (668 kB at 690 kB/s)
#0 25.27 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/validation/jakarta.validation-api/
3.0.2/jakarta.validation-api-3.0.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.12/spring-core-6
.1.12.jar (1.9 MB at 1.7 MB/s)
#0 25.40 Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.5.3.Fina
l/jboss-logging-3.5.3.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10.1.28/tomc
at-embed-el-10.1.28.jar (261 kB at 239 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.7.0/classmate-1.7.0.jar
[+] Building 57.7s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s5
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0so
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.7s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.9st
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s6
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s4
 => [internal] load build context                                                                            0.2s
 => => transferring context: 7.33kB                                                                          0.2sr
 => [build 3/5] COPY pom.xml .                                                                               0.1s
 => [build 4/5] COPY src ./src                                                                               0.1st
#0 25.59 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-dat
atype-jdk8/2.17.2/jackson-datatype-jdk8-2.17.2.jar.org/maven2/org/reactivestreams/reactive-streams/1.0.4/reactive-
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.
3.3/spring-boot-starter-json-3.3.3.jar (4.7 kB at 3.5 kB/s)e.org/maven2/org/springframework/boot/spring-boot-start
#0 25.67 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-dat
atype-jsr310/2.17.2/jackson-datatype-jsr310-2.17.2.jar/maven2/org/springframework/boot/spring-boot-starter-webflux
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator/8.0.1.Fi
nal/hibernate-validator-8.0.1.Final.jar (1.3 MB at 969 kB/s)
#0 25.68 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modul
e-parameter-names/2.17.2/jackson-module-parameter-names-2.17.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8
/2.17.2/jackson-datatype-jdk8-2.17.2.jar (36 kB at 26 kB/s)
#0 25.70 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-reactor-netty/3.3.3/spring-boot-starter-reactor-netty-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-paramete
r-names/2.17.2/jackson-module-parameter-names-2.17.2.jar (10 kB at 7.1 kB/s)
#0 25.76 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http
/1.1.22/reactor-netty-http-1.1.22.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-reactor
-netty/3.3.3/spring-boot-starter-reactor-netty-3.3.3.jar (4.8 kB at 3.2 kB/s)
#0 25.79 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.112.Final/ne
tty-codec-http-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr3
10/2.17.2/jackson-datatype-jsr310-2.17.2.jar (132 kB at 88 kB/s)
#0 25.81 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.112.Final/netty-
common-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-core/3.6.9/reactor-core-3.
6.9.jar (1.9 MB at 1.2 MB/s)
#0 25.86 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.112.Final/netty-
buffer-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http/4.1.112.Final/netty-codec-
http-4.1.112.Final.jar (668 kB at 406 kB/s)
#0 25.95 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.112.Final/net
ty-transport-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-http/1.1.22/re
actor-netty-http-1.1.22.jar (480 kB at 284 kB/s)
#0 25.99 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.112.Final/netty-c
odec-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-buffer/4.1.112.Final/netty-buffer-4.1
.112.Final.jar (337 kB at 193 kB/s)
#0 26.05 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.112.Final/netty
-handler-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport/4.1.112.Final/netty-transpo
rt-4.1.112.Final.jar (518 kB at 285 kB/s)
#0 26.13 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.112.Final/n
etty-codec-http2-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec/4.1.112.Final/netty-codec-4.1.1
12.Final.jar (352 kB at 186 kB/s)
#0 26.20 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.112.Final/
netty-resolver-dns-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-common/4.1.112.Final/netty-common-4.1
.112.Final.jar (694 kB at 362 kB/s)
#0 26.22 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.112.Final/nett
y-resolver-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-http2/4.1.112.Final/netty-codec
-http2-4.1.112.Final.jar (490 kB at 246 kB/s)
#0 26.30 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.112.Final/net
ty-codec-dns-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler/4.1.112.Final/netty-handler-4
.1.112.Final.jar (571 kB at 284 kB/s)
#0 26.32 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4
.1.112.Final/netty-resolver-dns-native-macos-4.1.112.Final-osx-x86_64.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns/4.1.112.Final/netty-reso
lver-dns-4.1.112.Final.jar (182 kB at 89 kB/s)
#0 26.36 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/
4.1.112.Final/netty-resolver-dns-classes-macos-4.1.112.Final.jar
#0 26.36 Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver/4.1.112.Final/netty
-resolver-4.1.112.Final.jar (38 kB at 18 kB/s)
#0 26.36 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.
112.Final/netty-transport-native-epoll-4.1.112.Final-linux-x86_64.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-native-macos/4.1.112.Fin
al/netty-resolver-dns-native-macos-4.1.112.Final-osx-x86_64.jar (19 kB at 9.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-common/4.1.112
.Final/netty-transport-native-unix-common-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-resolver-dns-classes-macos/4.1.112.Fi
nal/netty-resolver-dns-classes-macos-4.1.112.Final.jar (9.1 kB at 4.4 kB/s)
#0 26.41 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-classes-epoll/4.1
.112.Final/netty-transport-classes-epoll-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-dns/4.1.112.Final/netty-codec-d
ns-4.1.112.Final.jar (67 kB at 32 kB/s)
#0 26.41 Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/netty/reactor-netty-core
/1.1.22/reactor-netty-core-1.1.22.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-epoll/4.1.112.Final/
netty-transport-native-epoll-4.1.112.Final-linux-x86_64.jar (40 kB at 19 kB/s)
#0 26.42 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.112.Final
/netty-handler-proxy-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-transport-native-unix-common/4.1.112.
Final/netty-transport-native-unix-common-4.1.112.Final.jar (44 kB at 20 kB/s)
#0 26.49 Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-codec-socks/4.1.112.Final/n
etty-codec-socks-4.1.112.Final.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-handler-proxy/4.1.112.Final/netty-han
[+] Building 57.7s (11/13)
 => [build 5/5] RUN mvn clean package -DskipTests                                                           56.1se
 => => # 6.jar (41 kB at 452 kB/s)
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.e
 => => # 3.1/maven-filtering-3.3.1.jar (55 kB at 579 kB/s)
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plea
 => => # xus-utils-3.5.1.jar (269 kB at 1.6 MB/s)
 => => # Progress (1): 139/587 kB                                                                                l
/netty-transport-classes-epoll-4.1.112.Final.jar (147 kB at 68 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.2.5/http
core5-5.2.5.jar (855 kB at 320 kB/s)d-netflix-eureka-client-4.1.3.jar
#0 27.04 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-client/2.0.3/eur
eka-client-2.0.3.jar.jar (121 kB at 55 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.3.1/
httpclient5-5.3.1.jar (862 kB at 322 kB/s)
#0 27.04 Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/xstream/xstream/1.4.20/xs
tream-1.4.20.jar/4.1.3/spring-cloud-starter-netflix-eureka-client-4.1.3.jar (2.9 kB at 1.3 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webflux/6.1.12/spring-web
flux-6.1.12.jar (979 kB at 364 kB/s)
#0 27.05 Downloading from central: https://repo.maven.apache.org/maven2/io/github/x-stream/mxparser/1.2.2/mxparser
-1.2.2.jar.1.3/spring-cloud-netflix-eureka-client-4.1.3.jar (144 kB at 61 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.2.5/h
ttpcore5-h2-5.2.5.jar (237 kB at 87 kB/s)
#0 27.09 Downloading from central: https://repo.maven.apache.org/maven2/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.ja
r
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-client/2.0.3/eureka-client
-2.0.3.jar (408 kB at 143 kB/s)
#0 27.22 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/ws/rs/jakarta.ws.rs-api/3.1.0/jaka
rta.ws.rs-api-3.1.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/x-stream/mxparser/1.2.2/mxparser-1.2.2.jar
 (30 kB at 10 kB/s)
#0 27.23 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/ja
karta.inject-api-2.0.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/xmlpull/xmlpull/1.1.3.1/xmlpull-1.1.3.1.jar (7.2 kB
at 2.4 kB/s)
#0 27.31 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/spectator/spectator-api/1.7.3/
spectator-api-1.7.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/xstream/xstream/1.4.20/xstream-1.4.
20.jar (645 kB at 213 kB/s)
#0 27.39 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.1
6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inje
ct-api-2.0.1.jar (11 kB at 3.5 kB/s)
#0 27.41 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.3
/httpclient-4.5.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/ws/rs/jakarta.ws.rs-api/3.1.0/jakarta.ws.rs-
api-3.1.0.jar (155 kB at 51 kB/s)
#0 27.41 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.16/
httpcore-4.4.16.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.jar (69
kB at 22 kB/s)
#0 27.58 Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons
-codec-1.16.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcore/4.4.16/httpcore-4
.4.16.jar (328 kB at 102 kB/s)
#0 27.58 Downloading from central: https://repo.maven.apache.org/maven2/commons-configuration/commons-configuratio
n/1.10/commons-configuration-1.10.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.1
6.1.jar (365 kB at 108 kB/s)
#0 27.76 Downloading from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.6/commons-lang
-2.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/spectator/spectator-api/1.7.3/spectator-
api-1.7.3.jar (246 kB at 72 kB/s)
#0 27.77 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotat
ions/2.17.2/jackson-annotations-2.17.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-lang/commons-lang/2.6/commons-lang-2.6.jar (
284 kB at 79 kB/s)
#0 27.97 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.
17.2/jackson-core-2.17.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.17.
2/jackson-annotations-2.17.2.jar (78 kB at 22 kB/s)
#0 28.00 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databin
d/2.17.2/jackson-databind-2.17.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-configuration/commons-configuration/1.10/com
mons-configuration-1.10.jar (363 kB at 98 kB/s)
#0 28.08 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-eventb
us/0.3.0/netflix-eventbus-0.3.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.17.2/jacks
on-core-2.17.2.jar (582 kB at 154 kB/s)
#0 28.14 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-infix/
0.3.0/netflix-infix-0.3.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpclient/4.5.3/httpclien
t-4.5.3.jar (748 kB at 196 kB/s)
#0 28.17 Downloading from central: https://repo.maven.apache.org/maven2/commons-jxpath/commons-jxpath/1.3/commons-
jxpath-1.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-eventbus/0.3.0/n
etflix-eventbus-0.3.0.jar (69 kB at 18 kB/s)
#0 28.23 Downloading from central: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.3/joda-time-2.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/netflix-commons/netflix-infix/0.3.0/netf
lix-infix-0.3.0.jar (102 kB at 26 kB/s)
#0 28.26 Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr-runtime/3.4/antlr-runtime-
3.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr-runtime/3.4/antlr-runtime-3.4.jar (1
64 kB at 41 kB/s)
#0 28.37 Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/stringtemplate/3.2.1/stringtempl
ate-3.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-jxpath/commons-jxpath/1.3/commons-jxpath-1.3
.jar (300 kB at 73 kB/s)
#0 28.47 Downloading from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/bouncycastle/bcprov-jdk18on/1.78/bcprov-jdk18on-
1.78.jar (8.3 MB at 2.0 MB/s)
#0 28.50 Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10
.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/stringtemplate/3.2.1/stringtemplate-3.2.1.
jar (149 kB at 36 kB/s)
#0 28.55 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/servo/servo-core/0.5.3/servo-c
ore-0.5.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/joda-time/joda-time/2.3/joda-time-2.3.jar (582 kB at
 133 kB/s)
#0 28.74 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-math/2.2/common
s-math-2.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/servo/servo-core/0.5.3/servo-core-0.5.3.
jar (381 kB at 87 kB/s)
#0 28.77 Downloading from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/
javax.annotation-api-1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.anno
tation-api-1.2.jar (26 kB at 5.8 kB/s)
#0 28.89 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/jettison/jettison/1.5.4/jetti
son-1.5.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/antlr/antlr/2.7.7/antlr-2.7.7.jar (445 kB at 95 kB/s
)
#0 29.04 Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/gson/gson/2.10.1/gson-2.10.
1.jar (283 kB at 61 kB/s)
#0 29.04 Downloading from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-core/2.0.3/eurek
a-core-2.0.3.jar
#0 29.04 Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/woodstox/woodstox-core/6.2.1
/woodstox-core-6.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/netflix/eureka/eureka-core/2.0.3/eureka-core-2.0
.3.jar (240 kB at 49 kB/s)
#0 29.30 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/woodstox/stax2-api/4.2.1/stax
2-api-4.2.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/jettison/jettison/1.5.4/jettison-1.5.4.
jar (90 kB at 18 kB/s)
#0 29.31 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/33.0.0-jre/guava-33
.0.0-jre.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/woodstox/stax2-api/4.2.1/stax2-api-4.2.
1.jar (196 kB at 38 kB/s)
#0 29.52 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.2/failu
reaccess-1.0.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-math/2.2/commons-math-2.2
.jar (989 kB at 190 kB/s)
#0 29.56 Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-e
mpty-to-avoid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/failureaccess/1.0.2/failureaccess-1
.0.2.jar (4.7 kB at 906 B/s) => [internal] load build definition from Dockerfile
                       0.0s
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.8s
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.6s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0s
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => [internal] load build context                                                                            0.2s
 => => transferring context: 1.86kB                                                                          0.1s
 => [build 3/5] COPY pom.xml .                                                                               0.1s
 => [build 4/5] COPY src ./src                                                                               0.1s
 => [build 5/5] RUN mvn clean package -DskipTests                                                           56.2s
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexu
 => => # s-xml-3.0.0.jar (93 kB at 738 kB/s)
 => => # Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.
 => => # 3.jar (334 kB at 370 kB/s)
 => => # [INFO] Recompiling the module because of changed source code.
 => => # [INFO] Compiling 9 source files with javac [debug parameters release 21] to target/classes

#0 29.59 Downloading from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.41.0/c
hecker-qual-3.41.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/listenablefuture/9999.0-empty-to-av
oid-conflict-with-guava/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar (2.2 kB at 413 B/s)
#0 29.68 Downloading from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotati
ons/2.23.0/error_prone_annotations-2.23.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/errorprone/error_prone_annotations/2.23.0
/error_prone_annotations-2.23.0.jar (17 kB at 3.1 kB/s)
#0 29.83 Downloading from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/2.8/j
2objc-annotations-2.8.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/checkerframework/checker-qual/3.41.0/checker-qua
l-3.41.0.jar (229 kB at 41 kB/s)
#0 29.92 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-sta
rter-loadbalancer/4.1.4/spring-cloud-starter-loadbalancer-4.1.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/j2objc/j2objc-annotations/2.8/j2objc-anno
tations-2.8.jar (9.3 kB at 1.7 kB/s)
#0 29.96 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-loa
dbalancer/4.1.4/spring-cloud-loadbalancer-4.1.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-starter-loadb
alancer/4.1.4/spring-cloud-starter-loadbalancer-4.1.4.jar (2.6 kB at 459 B/s)
#0 30.04 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-cache/3.3.3/spring-boot-starter-cache-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-cache/3
.3.3/spring-boot-starter-cache-3.3.3.jar (4.8 kB at 823 B/s)
#0 30.14 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context-support
/6.1.12/spring-context-support-6.1.12.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-loadbalancer/
4.1.4/spring-cloud-loadbalancer-4.1.4.jar (139 kB at 24 kB/s)
#0 30.15 Downloading from central: https://repo.maven.apache.org/maven2/com/stoyanr/evictor/1.0.0/evictor-1.0.0.ja
r
Downloaded from central: https://repo.maven.apache.org/maven2/com/stoyanr/evictor/1.0.0/evictor-1.0.0.jar (29 kB a
t 4.9 kB/s)
#0 30.24 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-start
er-test/3.3.3/spring-boot-starter-test-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.
3.3/spring-boot-starter-test-3.3.3.jar (4.8 kB at 801 B/s)
#0 30.34 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/
3.3.3/spring-boot-test-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context-support/6.1.12/sp
ring-context-support-6.1.12.jar (173 kB at 29 kB/s)
#0 30.34 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-
autoconfigure/3.3.3/spring-boot-test-autoconfigure-3.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.17.2/j
ackson-databind-2.17.2.jar (1.6 MB at 272 kB/s)
#0 30.44 Downloading from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.9.0/json-p
ath-2.9.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfig
ure/3.3.3/spring-boot-test-autoconfigure-3.3.3.jar (219 kB at 35 kB/s)
#0 30.67 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.
2/jakarta.xml.bind-api-4.0.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.3.3/spri
ng-boot-test-3.3.3.jar (249 kB at 39 kB/s)
#0 30.74 Downloading from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/
2.1.3/jakarta.activation-api-2.1.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.3/jaka
rta.activation-api-2.1.3.jar (67 kB at 10 kB/s)
#0 30.91 Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.5.1/json-smart-2.
5.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.2/jakarta.
xml.bind-api-4.0.2.jar (131 kB at 20 kB/s)
#0 30.93 Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.5.1/accessor
s-smart-2.5.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.5.1/accessors-smart-2.
5.1.jar (30 kB at 4.5 kB/s)
#0 31.06 Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.6/asm-9.6.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.
jar (277 kB at 41 kB/s)
#0 31.06 Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-co
re-3.25.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.5.1/json-smart-2.5.1.jar (1
22 kB at 18 kB/s)
#0 31.06 Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-budd
y-1.14.19.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/woodstox/woodstox-core/6.2.1/woodstox-
core-6.2.1.jar (1.6 MB at 231 kB/s)
#0 31.22 Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility
-4.2.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.6/asm-9.6.jar (124 kB at 18 kB/s)
#0 31.36 Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.jar
 (97 kB at 14 kB/s)
#0 31.55 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/jun
it-jupiter-5.10.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/junit-jupiter
-5.10.3.jar (6.4 kB at 866 B/s)
#0 31.72 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3
/junit-jupiter-api-5.10.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.jar (123 kB a
t 17 kB/s)
#0 31.75 Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j
-1.3.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar
 (14 kB at 1.9 kB/s)
#0 31.95 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/
1.10.3/junit-platform-commons-1.10.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3/junit-jup
iter-api-5.10.3.jar (211 kB at 26 kB/s)
#0 32.38 Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apig
uardian-api-1.1.2.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.10.3/jun
it-platform-commons-1.10.3.jar (106 kB at 13 kB/s)
#0 32.45 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.1
0.3/junit-jupiter-params-5.10.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-ap
i-1.1.2.jar (6.8 kB at 831 B/s)
#0 32.55 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.1
0.3/junit-jupiter-engine-5.10.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.10.3/junit-
jupiter-engine-5.10.3.jar (245 kB at 27 kB/s)
#0 33.48 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1
.10.3/junit-platform-engine-1.10.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.10.3/juni
t-platform-engine-1.10.3.jar (205 kB at 20 kB/s)
#0 34.44 Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-co
re-5.11.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.10.3/junit-
jupiter-params-5.10.3.jar (586 kB at 58 kB/s)
#0 34.47 Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byt
e-buddy-agent-1.14.19.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-core-3.25.3.
jar (1.4 MB at 135 kB/s)
#0 34.55 Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.
jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.jar (49 kB
 at 4.7 kB/s)
#0 34.78 Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/m
ockito-junit-jupiter-5.11.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/mockito-jun
it-jupiter-5.11.0.jar (8.9 kB at 838 B/s)
#0 34.93 Downloading from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonasser
t-1.5.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.ja
r (31 kB at 2.9 kB/s)
#0 35.15 Downloading from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.
0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108
.vaadin1/android-json-0.0.20131108.vaadin1.jar (18 kB at 1.7 kB/s)
#0 35.32 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.1.12/spr
ing-test-6.1.12.jar
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byte-buddy-ag
ent-1.14.19.jar (263 kB at 24 kB/s)
#0 35.43 Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-cor
e-2.9.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-core-2.9.1.ja
r (175 kB at 15 kB/s)
#0 35.97 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-sta
rter-openfeign/4.1.3/spring-cloud-starter-openfeign-4.1.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-starter-openf
eign/4.1.3/spring-cloud-starter-openfeign-4.1.3.jar (2.6 kB at 224 B/s)
#0 36.05 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-ope
nfeign-core/4.1.3/spring-cloud-openfeign-core-4.1.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-openfeign-cor
e/4.1.3/spring-cloud-openfeign-core-4.1.3.jar (222 kB at 17 kB/s)
#0 37.05 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form-spring
/3.8.0/feign-form-spring-3.8.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-core-5.11.0.
jar (704 kB at 55 kB/s)
#0 37.09 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form/3.8.0/
feign-form-3.8.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form-spring/3.8.0/fei
gn-form-spring-3.8.0.jar (14 kB at 1.1 kB/s)
#0 37.22 Downloading from central: https://repo.maven.apache.org/maven2/commons-fileupload/commons-fileupload/1.5/
commons-fileupload-1.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/form/feign-form/3.8.0/feign-form
-3.8.0.jar (30 kB at 2.3 kB/s)
#0 37.36 Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.
11.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-fileupload/commons-fileupload/1.5/commons-fi
leupload-1.5.jar (74 kB at 5.6 kB/s)
#0 37.62 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.12/spri
ng-web-6.1.12.jar
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar (
327 kB at 23 kB/s)
#0 38.61 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.12/sp
ring-beans-6.1.12.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.1.12/spring-test-6
.1.12.jar (856 kB at 58 kB/s)
#0 39.00 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.
3/micrometer-observation-1.13.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.3/micromet
er-observation-1.13.3.jar (72 kB at 4.7 kB/s)
#0 39.51 Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.3/mi
crometer-commons-1.13.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/33.0.0-jre/guava-33.0.0-jre.j
ar (3.0 MB at 201 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-commons/4.1.
4/spring-cloud-commons-4.1.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.3/micrometer-c
ommons-1.13.3.jar (48 kB at 3.0 kB/s)
#0 39.96 Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-securi
ty-crypto/6.3.3/spring-security-crypto-6.3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-buddy-1.14.19.
jar (4.2 MB at 259 kB/s)
#0 40.69 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-core/13.3/feign-
core-13.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-crypto/
6.3.3/spring-security-crypto-6.3.3.jar (100 kB at 6.1 kB/s)
#0 40.70 Downloading from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-slf4j/13.3/feign
-slf4j-13.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-slf4j/13.3/feign-slf4j-13.
3.jar (4.1 kB at 246 B/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.12/spring-beans
-6.1.12.jar (862 kB at 52 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/cloud/spring-cloud-commons/4.1.4
/spring-cloud-commons-4.1.4.jar (263 kB at 16 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/github/openfeign/feign-core/13.3/feign-core-13.3.
jar (224 kB at 13 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.12/spring-web-6.1
.12.jar (1.9 MB at 107 kB/s)
#0 42.28 [INFO]
#0 42.28 [INFO] --- clean:3.3.2:clean (default-clean) @ gateway-service ---
#0 42.30 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/ple
xus-utils-4.0.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-
4.0.0.pom (8.7 kB at 37 kB/s)
#0 42.54 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.po
m
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.pom (27 kB a
t 122 kB/s)
#0 42.77 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/ple
xus-utils-4.0.0.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-
4.0.0.jar (192 kB at 348 kB/s)
#0 43.40 [INFO]
#0 43.40 [INFO] --- resources:3.3.1:resources (default-resources) @ gateway-service ---
#0 43.40 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1
.26/plexus-interpolation-1.26.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus
-interpolation-1.26.pom (2.7 kB at 12 kB/s)
#0 43.63 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom (23 kB
 at 105 kB/s)
#0 43.85 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/ple
xus-utils-3.5.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-
3.5.1.pom (8.8 kB at 57 kB/s)
#0 44.01 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.po
m
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom (25 kB a
t 385 kB/s)
#0 44.08 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.
3.1/maven-filtering-3.3.1.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-
filtering-3.3.1.pom (6.0 kB at 116 kB/s)
#0 44.13 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-compo
nents/39/maven-shared-components-39.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/m
aven-shared-components-39.pom (3.2 kB at 61 kB/s)
#0 44.19 Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1
.pom
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom (612
B at 9.6 kB/s)
#0 44.26 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.3
6.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom (2.7
 kB at 29 kB/s)
#0 44.36 Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent
-1.7.36.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.po
m (14 kB at 137 kB/s)
#0 44.46 Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7
/plexus-build-api-0.0.7.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-bu
ild-api-0.0.7.pom (3.2 kB at 28 kB/s)
#0 44.58 Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-p
arent-15.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.p
om (8.4 kB at 73 kB/s)
#0 44.70 Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-pa
rent-5.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom
 (8.4 kB at 131 kB/s)
#0 44.77 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/ple
xus-utils-3.5.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-
3.5.0.pom (8.0 kB at 123 kB/s)
#0 44.84 Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/co
mmons-lang3-3.12.0.pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang
3-3.12.0.pom (31 kB at 352 kB/s)
#0 44.93 Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.
pom
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom (5.1 k
B at 56 kB/s)
#0 45.02 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1
.26/plexus-interpolation-1.26.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus
-interpolation-1.26.jar (85 kB at 295 kB/s)
#0 45.31 Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/ple
xus-utils-3.5.1.jar
[+] Building 57.7s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 59.0s (11/13)
[+] Building 58.7s (11/13)
 => [internal] load build definition from Dockerfile                                                         0.0s1
 => => transferring dockerfile: 32B                                                                          0.0s
 => [internal] load .dockerignore                                                                            0.0s7
 => => transferring context: 2B                                                                              0.0s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.7s-
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.5s
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0so
 => [internal] load build definition from Dockerfile                                                         0.0s
[+] Building 59.3s (12/13)
 => [internal] load build definition from Dockerfile                                                         0.0s
 => => transferring dockerfile: 32B                                                                          0.0s6
 => [internal] load .dockerignore                                                                            0.0s
 => => transferring context: 2B                                                                              0.0su
 => [internal] load metadata for docker.io/library/maven:3.9-eclipse-temurin-21-alpine                       0.7s
 => [internal] load metadata for docker.io/library/eclipse-temurin:21-jdk-alpine                             0.9s
 => [stage-1 1/3] FROM docker.io/library/eclipse-temurin:21-jdk-alpine@sha256:c4799f335a65b1ecca8a31239b055  0.0s
 => CACHED [stage-1 2/3] WORKDIR /app                                                                        0.0sg
 => [build 1/5] FROM docker.io/library/maven:3.9-eclipse-temurin-21-alpine@sha256:922927df2c662cdd47ddb1164  0.0s
 => CACHED [build 2/5] WORKDIR /app                                                                          0.0s
 => [internal] load build context                                                                            0.2s
 => => transferring context: 7.33kB                                                                          0.2s
 => [build 3/5] COPY pom.xml .                                                                               0.1s
 => [build 4/5] COPY src ./src                                                                               0.1s
 => CANCELED [build 5/5] RUN mvn clean package -DskipTests                                                  57.6s
failed to solve: executor failed running [/bin/sh -c mvn clean package -DskipTests]: exit code: 1
