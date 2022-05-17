# SpringBoot_sbb
스프링부트 학습

학습도서 : 점프 투 스프링부트
https://wikidocs.net/book/7601

Java version : 17.0.3
IDE : STS(Spring Tool Suite)
DB : H2
템플릿 엔진 : 타임리프(Thymleaf)

스프링부트 도구 설치하기
- Spring Boot Devtools : 개발할때 클래스 변경시 서버를 재가동을 해야하는 번거로움이 있지만 설정시 서버를 자동으로 재기동해준다
 =설정방법= <build.gradle 파일> : dependencies 항목에 developmentOnly 'org.springframework.boot:spring-boot-devtools' 추가

JPA 란?
JPA는 자바 진영에서 ORM(Object-Relational Mapping)의 기술 표준으로 사용하는 인터페이스의 모음이다.

리포지터리의 메서드명은 where 조건을 결정하는 역할을한다.
메서드명은 공식문서 https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation 참고하기

서비스(service)
컨트롤러에서 리포지터리를 직접 호출하지 않고 중간에 서비스를 두어 데이터를 처리한다
서비스가 필요한 이유 : 컨트롤러는 리포지터리 없이 서비스를 통해서만 데이터베이스에 접근하도록 구현하는 것이 보안상 안전하다. 이렇게 하면 어떤 해커가 해킹을 통해 컨트롤러를 제어할 수 있게 되더라도 리포지터리에 직접 접근할 수는 없게 된다.

Spring Boot Validation
전달받은 입력 값을 검증하는 라이브러리
build.gradle에 dependencies { implementation 'org.springframework.boot:spring-boot-starter-validation' } 로 설치
이노테이션은 https://beanvalidation.org/를 참조
