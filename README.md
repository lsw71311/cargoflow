# 물류 관리 시스템
<img src="https://img.shields.io/badge/github-181717?style=for-the-badge&logo=github&logoColor=white">
<img src="https://capsule-render.vercel.app/api?type=wave&color=auto&height=300&section=header&text=물류관리시스템&fontSize=90" />

## :mortar_board: 목차
[1. 개요](#1-개요)

[2. 주요 기능](#2-주요기능)

[3. 문제 해결](#3-문제-해결)

[4. 서비스 구성 및 실행 방법](#4-서비스구성-및-실행-방법)



## 1. 개요
### :computer: 프로젝트 개요
- 프로젝트 목적 : REST API를 활용하여 API 통신 목적의 프로젝트

- 프로젝트 설명 : 모놀리틱으로 개발하였지만 MSA 전환 등을 고려하여 각 서비스를 독립적으로 운영하고 인터페이스 활용해 통신

<hr>


### :computer: 기술 스택
#### Platform
![Windows](https://img.shields.io/badge/Windows-2496ED)
![IntelliJ](https://img.shields.io/badge/IntelliJ-2496ED)

#### SERVER
![Docker](https://img.shields.io/badge/Doker-2496ED)
#### RDBMS
![Postgres](https://img.shields.io/badge/Postgres-2496ED)
![Jpa](https://img.shields.io/badge/Jpa-2496ED)

#### Application Development / Skills
![Java](https://img.shields.io/badge/Java-2496ED)
![Spring Eureka](https://img.shields.io/badge/Spring%20Cloud-00FF7F)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-00FF7F)
![Feign Client](https://img.shields.io/badge/Feign%20Client-2496ED)
<hr>

### :busts_in_silhouette: 팀원 소개
- 팀원 - 위성구 :walking:  [Github](https://github.com/weseonggu)
<hr>

### :flags: 기본 규칙
- 계층구조 : DDD 및 클린 아키텍처


## 2. 주요기능
:arrow_right: 위성구
본인 역할 :
- Spring Eureka, FeignClient, Config Server, Api Gateway, Zipkin 초기 셋팅 및 실행
- AWS S3를 사용한 공유라이브러리 운영
- 깃 리포지토리를 사용하여 설정파일 관리
- Api Gateway JWT 검증 및 인가 구현
- 각 마이크로 서비스에서 프록시를 사용한 권한 정보를 사용한 확인 구현




## 3. 문제 해결
:arrow_right: 발생한 문제
- 공유 라이브러리를 Maven Repository에 배포 실패
    - AWS S3를 사용하여 배포 (멀티 모듈 프로젝트로 구성으로 해결가능)

## 4. 서비스구성 및 실행 방법
- JAVA 버전 : 17

- 스프링부트 버전 : 3.3.3

- 설정 파일 : application.yml(로컬용), application-product.yml(배포용)

















