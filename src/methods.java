static int sumof(int a, int b){
    int c = a+b;
    return c;
}

static void multipicationof(int a ,int b){
    System.out.println(a*b);
}

static void printStatement(){
    System.out.println("PRINT##");
}

static void main(){
    int d = sumof(5,8);
    System.out.println("Sum of a and b : " + d);
    multipicationof(5,6);
    printStatement();
}

