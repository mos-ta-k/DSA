import java.sql.Blob;

public class SearchInString {
    public static void main(String[] args){

        String sub = "DataStructure";
        char target = 'm';

        System.out.println(search(sub, target));
    }

    static boolean search(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i<str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;

    }
}
