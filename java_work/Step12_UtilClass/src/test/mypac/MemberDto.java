package test.mypac;

public class MemberDto {
   //필드의 접근지정자를 private로
   private int num;
   private String name;
   private String addr;
   //디폴트 생성자
   public MemberDto() {};
   
   public MemberDto(int num, String name, String addr) {
      super();
      this.num=num;
      this.name=name;
      this.addr=addr;
      
      }

   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getAddr() {
      return addr;
   }

   public void setAddr(String addr) {
      this.addr = addr;
   };
      
   }