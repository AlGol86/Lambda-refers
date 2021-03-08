public class Lambda {

        public static void print0(){
            System.out.println("stat");
        }
        public void print1(){
            System.out.println("instance");
        }
        private static void printing(SomeInt si){
            si.print();
        }

        //for class method ref (tricky!)
        private static void printing2(SomeInt2 si,Lambda le){
            si.print(le);
        }

        public static void main(String[] args) {
            printing(()-> System.out.println("LAMBDA"));
            ////static method ref
            printing(Lambda::print0);
            ///instance method ref
            Lambda le=new Lambda();
            printing(le::print1);

            ///instance method via class method ref (tricky!)
            printing2(Lambda::print1,le);


        }
    }
    interface SomeInt{
        void print();
    }

    //for class method ref (tricky!)
    interface SomeInt2{
        void print(Lambda le);
    }
