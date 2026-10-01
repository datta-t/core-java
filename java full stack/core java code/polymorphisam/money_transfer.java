 class bank {
    void transfer_money(long account_no, int amount){
        System.out.println("transferd $ "+amount);
        System.out.println("accont no is : "+account_no);
    }

     void transfer_money(long account_no, int amount , String remark){
       System.out.println("transferd $ "+amount);
        System.out.println("accont no is : "+account_no);
        System.out.println("remark is :"+remark);
    }
}
public class money_transfer{
    public static void main(String[] args){
        bank obj= new bank();
        obj.transfer_money(1234,1000 );
        obj.transfer_money(234,2000,"rent" );


        
    }
}
