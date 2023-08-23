# 키친포스

## 퀵 스타트

```sh
cd docker
docker compose -p kitchenpos up -d
```

## 요구 사항

* 키친 포스를 구현한다.

* 상품
    * [ ] 상품은 이름과 가격을 갖는다.
    * [ ] 상품은 등록할 수 있다.
    * [ ] 이름은 비어 있을 수 없다, 이름은 욕설을 포함해서는 안되고 가격은 0원 이상의 값을 갖는다.
    * [ ] 상품은 수정할 수 있다.
    * [ ] 가격을 수정하는 상품을 가진 메뉴의 가격이 수정 후보다 수정 전이 크다면 상품 판매를 멈춘다.
    * [ ] 모든 상품을 조회할 수 있다.

* 메뉴 그룹
  * [ ] 메뉴 그룹은 이름을 갖는다.
  * [ ] 해당되는 메뉴들의 모음을 메뉴 그룹이라고 한다.
  * [ ] 메뉴 그룹은 등록할 수 있다.
  * [ ] 메뉴 그룹의 이름은 비어 있을 수 없다.
  * [ ] 모든 메뉴 그룹을 조회할 수 있다.

* 메뉴
  * [ ] 메뉴를 등록할 수 있다.
    * [ ] 메뉴는 이름, 가격, 메뉴 그룹 정보, 상품 노출 여부, 메뉴 상품 목록을 갖는다.
    * [ ] 메뉴의 가격은 비어 있을 수 없고 0원 이상이어야 한다.
    * [ ] 메뉴 그룹 값을 필수로 있어야 한다.
    * [ ] 메뉴 상품 목록은 필수로 있어야 하고 메뉴 상품들의 개수는 0개 이상이어야 한다.
    * [ ] 메뉴 가격은 메뉴 상품들의 총합보다 작아야 합니다.
    * [ ] 메뉴명에 욕설을 포함해서는 안됩니다.
  * [ ] 메뉴 가격은 변경할 수 있다.
    * [ ] 메뉴의 가격은 비어 있을 수 없고 0원 이상이어야 한다.
    * [ ] 수정 후 메뉴의 가격이 메뉴에 속한 상품의 총 가격보다 클 수 없다.
  * [ ] 메뉴를 노출할 수 있다
  * [ ] 메뉴를 노출하지 않게 할 수 있다.
  * [ ] 모든 메뉴를 조회할 수 있다.

* 주문
  * [ ] 주문은 주문타입, 주문상태, 주문 시각, 주문 상품 목록, 배달 장소, 오더 테이블 값을 갖는다.
    * [ ] 주문 타입은 배달, 포장, 매장식사 값을 갖는다.
    * [ ] 주문 상태는 대기, 승인, 서빙완료, 배달중, 배달완료, 완료 값을 갖는다.
  * [ ] 주문은 등록할 수 있다.
    * [ ] 주문 타입과 주문상품 목록은 필수로 등록되어야 한다.
    * [ ] 존재하지 않는 메뉴는 주문할 수 없다.
    * [ ] 매장식사가 아니라면 하나 이상의 주문이 포함되어야 한다.
    * [ ] 판매중이지 않은 메뉴가 주문에 존재해서는 안된다.
    * [ ] 배달인 경우 주소값은 필수로 존재해야 한다.
    * [ ] 매장 식사인 경우 주문 테이블은 필수로 존재해야하고, 점유된 상태여야 한다.
  * [ ] 주문 승인을 할 수 있다.
    * [ ] 주문 승인은 전 주문 상태가 대기 상태여야한다.
    * [ ] 주문 승인은 주문 타입이 배달인 경우 배달 요청을 보낸다.
  * [ ] 서빙 완료를 할 수 있다.
    * [ ] 서빙 완료는 전 주문 상태가 승인이어야 한다.
  * [ ] 배달중 상태로 변경할 수 있다.
    * [ ] 배달중 상태는 주문 타입이 배달이어야 한다.
    * [ ] 배달중 상태의 전 주문 상태는 서빙완료여야 한다.
  * [ ] 배달 완료 상태로 변경할 수 있다.
    * [ ] 배달 완료 상태는 전 주문 상태가 배달중이어야 한다.
  * [ ] 완료 상태로 변경할 수 있다.
    * [ ] 주문 타입이 배달인 경우 전 주문 상태가 배달완료여야 한다.
    * [ ] 주문 타입이 포장 또는 매장 식사인 경우 전 주문 상태는 서빙완료여야 한다.
    * [ ] 주문 타입이 매장식사인 경우 테이블 점유 상태를 해제하고, 주문 테이블의 손님수도 0으로 변경한다.
  * [ ] 모든 주문 목록을 조회할 수 있다.

* 주문 테이블
  * [ ] 주문 테이블은 이름, 손님수, 점유상태 값을 갖는다. 그리고 이 값들은 필수로 존재해야 한다.
  * [ ] 주문 테이블은 등록할 수 있다.
    * [ ] 주문 테이블은 점유상태로 변경할 수 있다.
    * [ ] 주문 테이블을 정리할 수 있다. 이를 수행하려면 주문 상태가 완료여야 한다.
  * [ ] 주문 테이블의 손님 수를 변경할 수 있다.
    * [ ] 주문 테이블의 손님 수는 0명 이상이어야 한다.
    * [ ] 손님 수를 변경하려면 테이블이 점유된 상태여야한다.
  * [ ] 모든 주문 테이블 목록을 조회할 수 있다.




## 용어 사전

| 한글명 | 영문명 | 설명 |
| --- | --- | --- |
|  |  |  |

## 모델링
