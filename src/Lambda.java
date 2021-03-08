public class Lambda {
public static <T>void print_st(T t){
    System.out.println(t);
}
static void printing(SomeInt si){
    si.print(5);
}

        public static void main(String[] args) {
          printing(Lambda::print_st);


        }
    }

    interface SomeInt{
        <T>void print(T t);
    }


