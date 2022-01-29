# 너구리게임 재현 프로젝트

### 기획 배경

  +   각자의 취업 및 이직을 목표로 포트폴리오 작성을 하기 위해 시작한 프로젝트입니다.
  +   MZ세대에게 추억의 게임중 하나인 너구리 게임을 두 사람이 재현해 봄으로써 어떠한 Logic으로 이루어져 있는지 이해하기 위하여 기획 하였습니다.

### 구현 목록

+ 너구리 캐릭터
  + 생명 5개
  + 모든 생명 소진시 게임 종료  
  + 적 오브젝트(캐릭터, 압정)과 닿을시 사망
  + 남은 시간내에 클리어 실패시 사망
  + 아래 층으로 추락시 사망
  + 방향키로 상하좌우 이동 가능
  + 스페이스 바로 점프 가능
  + 왼쪽 또는 오른쪽 방향키 + 스페이스 바를 길게 누를 시 긴 점프 가능
  + 사다리 위치에서 위 또는 아래 방향키를 누를 시 상하로 이동 가능
+ 스테이지 
  + 총 스테이지 10개
  + 최종 스테이지 클리어 시 최종 스테이지를 반복해서 플레이 가능
  + 음식물을 모두 획득 했을 경우 스테이지 클리어
  + 플레이어 사망시, 해당 스테이지에서 다시 시작 (남은 생명이 존재할 경우)
  + 스테이지 다시 시작할 시, 이전 스테이지에서 획득한 점수로 롤백
    + ex) 4스테이지까지 획득한 점수가 15000점이고 5스테이지에서 사망한 경우, 15000점을 가진채로 5스테이지 재도전
+ 오브젝트
  + 적 캐릭터(지네, 뱀) 
    + 각 캐릭터마다 3가지 색상(초록, 주황, 빨강)이 존재
    + 색상과 어떠한 적 캐릭터냐에 따라 이동 속도 변화
  + 압정 
  + 랜덤 주머니
    + 하나의 스테이지당 4개 등장
    + 70%확률로 점수 획득
    + 30%확률로 적 캐릭터 등장
      + 등장할 적 캐릭터는 초록색 뱀으로 고정 
  + 음식물 ( 사과, 바나나, 파인애플, 체리, 아보카도, 옥수수, 오렌지, 딸기, 수박, 맥주)
    + 매 스테이지마다 총 10개 등장
+ 시간
  + 매 스테이지마다 100초 카운트다운
  + 스테이지 클리어시 남은 시간에 따라 보너스 점수 획득   
+ 점수
  + 음식물
    + 획득한 음식물 갯수에 따라 10, 20, 40, 80, 100, 200, 400, 600, 800, 1000점 획득
  + 남은 시간
    + 1초당 20점 획득
  + 랜덤 주머니
    + 4개 전부 점수일 시 등장한 경우 점수 총 380점 획득 (30, 50, 100, 200점) 
    + 3개만 점수일 시 총 180점 획득 (30, 50, 100점)
    + 2개만 점수일 시 총 80점 획득 (30, 50점)
    + 1개만 점수일 시 총 30점 획득

### 사용 스킬 

|구분|내용|
|------|---|
|OS|Windows 10 Home 64bit|
|JDK|JDK8_301 64bit|
|Development Tool|Eclipse v4.7.3|
|Library|Log4J -v1.2.17|

### 실행 방법

실행 프로그램(.exe)로 배포 계획중입니다. 프로젝트 결과물이 나오면 실행 방법을 기재하겠습니다.


### ETC

개발 과정에 따라 구현 목록이 변경될 수 있습니다.
