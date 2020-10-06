class OneBHK{
    int roomArea;
    int hallArea;
    int price;

    OneBHK(){
        roomArea = 100;
        hallArea = 100;
        price = 10000;
    }

    OneBHK(int roomArea , int hallArea , int price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    void show(){
        System.out.println("\n\nRoom area : "+roomArea);
        System.out.println("Hall area : "+hallArea);
        System.out.println("Price  ; "+price);
    }
}

class TwoBHK  extends OneBHK{
    int room2Area;

    TwoBHK(int roomArea , int hallArea , int price , int room2Area ){
        super(roomArea,hallArea,price);
        this.room2Area = room2Area;
    }
    void show(){
        super.show();
        System.out.println("Room 2 Area : "+room2Area);
    }

}

class Main{
    public static void main(String[] agrs){
        TwoBHK t1 = new TwoBHK(100,100,10000,100);
        TwoBHK t2 = new TwoBHK(200,200,20000,200);
        TwoBHK t3 = new TwoBHK(300,300,30000,300);
        TwoBHK arr[] = {t1,t2,t3};
        for(TwoBHK i : arr) i.show();
    }
}