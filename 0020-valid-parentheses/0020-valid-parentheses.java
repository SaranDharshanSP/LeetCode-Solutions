class Solution {
 public boolean isValid(String s) {
    int length;
    while (0< (length = s.length())) {
        s = s.replace("()", "").replace("{}", "").replace("[]", "");
        if (length == s.length()) {
            break;
        }
    }
    return s.length() == 0;
}

}