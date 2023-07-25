# Java 웹 & 앱 개발
2023.07.13~

나라에서 지원하는 국비지원 교육으로 java문법을 공부한 기록입니다.

---
Loop폴더 -> 반복문 연습

Method폴더 -> Method를 이용한 코드작성 연습

Recursion -> 재귀함수를 이용하여 코드작성 연습

ClassPractice -> class를 이용하여 코드작성 연습


# 커리큘럼

### Step 1	자바 프로그래밍	- 컴퓨터 동작 원리 및 프로그램의 이해

- 자바 개발환경 구축(JDK 및 Eclips)
- 자료형, 연산자, 기초 프로그램 문법
- 객체 지향 프로그래밍(Object Oriendted Programming)(캡슐화, 상속, 다형성)
- 추상클래스(Abstract Class)와 인터페이스(Interface)
- 디자인 패턴(Design Pattern)(singleton, strategy, facade, proxy, template pattern)
- 파일 입출력(I/O, stream)
- 컬렉션 프레임워크(AraryList, Vector, LinkedList, Stack, Queue, TreeSet, HashSet, LinkedTreeSet, HashMap, HashTable, Properties)
- 멀티스레드와 네트워크(Network - TCP/IP, UDP 프로토콜)
- 형상관리의 이해 및 활용(github & gitlab & bitbucket, E-git, source-tree)

### Step 2	RDBMS 활용	- 데이터베이스의 이해
- Oracle RDBMS 구축 및 IDE(Sql developer) 설치
- 데이터 추출 언어(DQL - SELECT)
- 데이터 조작 언어(DML - INSERT, UPDATE, DELETE)
- 데이터 정의 언어(DDL - CREATE, ALTER, DROP)
- Oracle DBMS Object (SEQUENCE, INDEX, VIEW 등)
- Procedure Language(내장 절차형 언어)
- stored procedure & function
- RDBMS 모델링(엔터티 도출, 정규화, 관계정의)
- JDBC 표준 인터페이스를 활용한 Java Application 연동

### Step 3	웹 표준 기술	- 웹(Web)의 이해
- 웹 표준 기술의 이해
- HTML5 태그 및 Sementic Tag
- CSS3 및 반응형 웹 제작
- JavaScript 기초 문법
- Web Browser를 위한 JavaScript 문법
- AJAX(Asynchronous Javascript And XML)을 이용한 비동기방식의 통신

### Step 4	서버프로그램 개발	- 서버-클라이언트 모델의 이해
- HTTP 프로토콜의 이해
- HTTP method 방식의 이해
- Web Server의 역할 이해 및 구현
- Servlet API를 이용한 백엔드 애플리케이션 개발
- filter, wrapper, listener, cookie, session
- Tomcat middle-ware를 이용한 서버 환경 구축 - redirecr와 forward방식의 이해
- stream을 이용한 파일 업로드/다운로드
- JSP, Expression Language / JSTL

### Step 5	프레임워크 기반 프로그래밍	- Persistance Framework(MyBatis)의 이해
- MyBatis 개발환경 구축
- RDBMS 연동 및 CRUD 연산
- Tag Element와 Provider Annotation을 이용한 DynamicSQL 구현
- MyBatis Mapper & Config Tab Element의 활용
- Java Framework(Spring)의 이해
- Spring Container의 이해
- Spring Core Technology(Dependancy Injection, Aspect Oriented Programming, SpEL, i18n 다국어 메세지 처리)
- java reflect 패키지를 활용한 Spring Framework의 동작 원리 이해(invoke & dynamic proxy 구현)
- Spring과 MyBatis Framework 연동 설정
- Spring Web Module(MVC, RequestMapping, config, handler, view-resolver, interceptor)
- Spring RestfulController
- Maven build tool

### Step 6	리눅스의 이해 및 활용	- 운영체제와 리눅스의 이해
- 리눅스 관리자의 기본 역할
- 리눅스 기본 명령어 및 사용자 관리
- 네트워크 관련 설정과 명령어
- 파이프, 필터, 리디렉션, 프로세스, 데몬, 서비스
- 텔넷, OpenSSH 서버 원격지 시스템 관리
- 웹서버 설치와 운영(tomcat)
- 보안을 위한 네트워크 설계 및 방화벽 구축

### Step 7	Docker를 활용한 컨테이너 기술	- 가상화 컨테이너 기술의 이해
- Docker를 이용한 이미지 생성
- 이미지를 이용한 컨테이너 생성 및 구동
- 배포를 위한 이미지(dockerfile) 생성

### Step 8	현장실습(실무 회의 견학)	- 클라우드 서버의 이해
- AWS EC2 인스턴스 생성 및 구축
- EC2 인스턴스에 EBS 볼륨 장작, 포맷, 마운트, 제거
- EBS 스냅샷 생성 및 AMI 생성, 복사

### Step 9	AWS를 활용한 클라우드 서버 구축과 클라우드 서버 보안	- EC2 서버에 웹애플리케이션 배포
- AWS RDS 인스턴스 생성 및 구축
- RDS에 Oracle RDBMS 구축
- AWS S3 버킷 생성, 세부 설정
- IAM 그룹 생성, 사용자 생성, 역할 생성 및 활용
- Docker 이미지를 이용한 클라우드 서버 내 배포 환경 구축
- Route 53을 이용한 DNS 활용
- 클라우드 서버 보안의 이해
- 클라우드 서버의 위해 요소
- 클라우드 서버 보안 설정 적용(EC2, RDS, S3)
- 보안그룹과 네트워크 ACL
- VPC플로우 로그 사용 권한
- AWS WAF를 이용한 웹 애플리케이션 보안

### Step 10	Spring Security를 이용한 애플리케이션 사용자 인증보안	- 사용자 인증의 이해
- 암호화 방식의 이해 및 구현(Bcrypt 암호화 알고리즘, RSA)
- 스프링 시큐리티 기본 API 및 Filter chaing 이해
- Spring security 주요 아키텍처의 이해
- 인증 process 구현
- session, JWT, OAuth2.0 방식의 인증 구현

### Step 11	웹 취약점 분석 및 시큐어 코딩	- 해킹 기법의 이해 및 웹 취약점의 이해
- 웹 10대 취약점의 이해(OWASP)
- SQL Injection, Broken Authentication, Sensitive Data Exposure, XML External Entities, Broken Access Control, Security misconfigurations, Cross Site Scripting, Insecure Deserialization, Using Conponents with known vulnerabilities, Insufficient logging an
- 웹 10대 취약점 점검 시나리오 작성 및 테스트
- 취약점 시나리오 대응 시큐어 코딩 적용

### Step 12	MVC Model2 기반의 웹 애플리케이션 개발

- [A그룹] MVC Model2 기반의 Servlet API를 활용한 여행 매칭 플랫폼 개발
- [B그룹] MVC Model2 기반의 Servlet API를 활용한 간식 큐레이팅 서비스 개발
- [C그룹] MVC Model2 기반의 Servlet API를 활용한 식당 예약 서비스 개발
- [D그룹] MVC Model2 기반의 Servlet API를 활용한 중고거래 플랫폼 서비스 개발

### Step 13	전자정부 프레임워크 기반 기술 Spring프레임워크를 활용한 웹 애플리케이션 개발
- [A그룹] 전자정부 프레임워크 기반 기술 Spring Framework를 이용한 클라우드 펀딩(crowd-function) 시스템 개발
- [B그룹] 전자정부 프레임워크 기반 기술 Spring Framework를 이용한 주문, 결제(Order-Payment) 시스템 개발
- [C그룹] 전자정부 프레임워크 기반 기술 Spring Framework를 이용한 비대면(contactless) 수요 매칭 시스템 개발
- [D그룹] 전자정부 프레임워크 기반 기술 Spring Framework를 이용한 교육관리(LMS) 시스템 개발

### Step 14	시큐어 코딩을 적용한 웹 애플리케이션 개발 및 클라우드 보안을 적용한 클라우드 서버 구축 및 배포
- [A그룹] 시큐어 코딩과 사용자 인증 보안을 적용한 Saas 기반 인사관리(HR) ERP Module 구현 및 보안 설정 적용된 클라우드 서버 배포
- [B그룹] 시큐어 코딩과 사용자 인증 보안을 적용한 Saas 기반 그룹웨어(Group Ware) 구현 및 보안 설정 적용된 클라우드 서버 배포
- [C그룹] 시큐어 코딩과 사용자 인증 보안을 적용한 Saas 기반 영업관리(CRM) 프로그램 구현 및 보안 설정 적용된 클라우드 서버 배포
- [D그룹] 시큐어 코딩과 사용자 인증 보안을 적용한 Saas 기반 애자일 기법 프로젝트 관리 툴(PMS) 구현 및 보안 설정 적용된 클라우드 서버 배포
