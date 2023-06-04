package Java.Advanced.Autoboxing;

public class NonGenericApp {
    public static void main(String[] args) {
        MyData myData1 = new MyData();
        System.out.println("Pune");

        MyData myData2 = new MyData();
        myData2.setData(469);

        String myCity = (String) myData1.getData();
        System.out.println(myCity);

        int myLuckyNo = (Integer) myData2.getData();
        System.out.println(myLuckyNo);
    }
}

class MyData {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
