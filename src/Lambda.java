public class Lambda {

    public static void print_st(String t) {
        System.out.println(t);
    }

    public static void print_st2(int t) {
        System.out.println(t);
    }


    static <T> void printing(SomeInt<T> si, T t) {
        si.print(t);
    }

    public static void main(String[] args) {

        printing(Lambda::print_st, "ghk");
        printing(Lambda::print_st2, 100);

    }
}

interface SomeInt<T> {
    void print(T t);
}


