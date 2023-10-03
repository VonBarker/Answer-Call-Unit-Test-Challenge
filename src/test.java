public class test {
        public static void main(String[] args) {
            Call test1 = new Call("U", true, "09:00");
            System.out.println(test1.answerCall());

            Call test2 = new Call("U", false, "14:00");
            System.out.println(test2.answerCall());

            Call test3 = new Call("U", true, "23:50");
            System.out.println(test3.answerCall());
            
            Call test4 = new Call("T", true, "10:40");
            System.out.println(test4.answerCall());
            
            Call test5 = new Call("T", false, "23:00");
            System.out.println(test5.answerCall());

            Call test6 = new Call("F", false, "10:00");
            System.out.println(test6.answerCall());

            Call test7 = new Call("F", false, "23:00");
            System.out.println(test7.answerCall());

            Call test8 = new Call("R", true, "09:00");
            System.out.println(test8.answerCall());

            Call test9 = new Call("R", false, "04:00");
            System.out.println(test9.answerCall());
        }
}
