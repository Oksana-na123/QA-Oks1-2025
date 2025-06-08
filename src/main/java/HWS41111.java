import java.lang.module.FindException;
import java.text.StringCharacterIterator;

        public class HWS41111 {
            public static void main(String[] args) {
                String text = " this string will be reversed";
                String reversed = "";

                for (int i = text.length() - 1; i >= 0; i--) {
                    reversed = reversed + text.charAt(i);
                }


                System.out.println(reversed);
            }
        }
