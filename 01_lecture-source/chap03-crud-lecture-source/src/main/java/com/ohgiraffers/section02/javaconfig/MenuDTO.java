package com.ohgiraffers.section02.javaconfig;


//@NoArgsConstructor     //기본생성자
//@AllArgsConstructor    // 모든 필드 초기화 생성자
//@Getter
//@Setter
//@ToString
//@Data        // 버전에 따라 오류 발생 -> Data 굳이 사용 x  - 위에 다섯가지 요소를 한 번에 포함하는 어노테이션(@) / 혹시 모를 에러 떄문에 잘 사용하지 않는다.
public class MenuDTO {

    private  int code;
    private String name;
    private  int price;
    private  int categoryCode;
    private  String orderableStatus;

    public MenuDTO() {
    }

    public MenuDTO(int code, String name, int price, int categoryCode, String orderableStatus) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getOrderableStatus() {
        return orderableStatus;
    }

    public void setOrderableStatus(String orderableStatus) {
        this.orderableStatus = orderableStatus;
    }

    @Override
    public String toString() {
        return "MenuDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode=" + categoryCode +
                ", orderableStatus='" + orderableStatus + '\'' +
                '}';
    }
}
