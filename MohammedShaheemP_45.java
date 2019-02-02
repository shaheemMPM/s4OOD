class MyClass{
    public static void main(String args[]){
      int i, j;
        for (i=1; i<=11; i++) {
          for (j=0; j<21-i; j++) {
            System.out.print(" ");
          }
          for (j=0; j<(2*i-1); j++) {
            System.out.print("1");
          }
          System.out.println();
        }
        for (i=1; i<=10; i++) {
          for (j=0; j<10-i; j++) {
            System.out.print(" ");
          }
          for (j=0; j<11; j++) {
            System.out.print("1");
          }
          for (j=0; j<(2*i-1); j++) {
            System.out.print(" ");
          }
          for (j=0; j<11; j++) {
            System.out.print("1");
          }
          System.out.println();
        }
        for (i=1; i<=9; i++) {
          for (j=0; j<i; j++) {
            System.out.print(" ");
          }
          for (j=0; j<11; j++) {
            System.out.print("1");
          }
          for (j=0; j<(19-2*i); j++) {
            System.out.print(" ");
          }
          for (j=0; j<11; j++) {
            System.out.print("1");
          }
          System.out.println();
        }
        for (i=1; i<=11; i++) {
          for (j=0; j<9+i; j++) {
            System.out.print(" ");
          }
          for (j=0; j<(23-2*i); j++) {
            System.out.print("1");
          }
          System.out.println();
        }
    }
}
