package Day47_Java_Practice_5;

public class Delete_Characters_to_Make_Fancy_String {
    public String makeFancyString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        for(int i = 0; i<stringBuilder.length() - 2;i++){
            if(stringBuilder.charAt(i) == stringBuilder.charAt(i + 1) && stringBuilder.charAt(i) == stringBuilder.charAt(i+2)){
                stringBuilder.deleteCharAt(i);
                i--;
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Delete_Characters_to_Make_Fancy_String delete_characters_to_make_fancy_string = new Delete_Characters_to_Make_Fancy_String();
        System.out.println(delete_characters_to_make_fancy_string.makeFancyString("aaabaaaa"));
    }
}
