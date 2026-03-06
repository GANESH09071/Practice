class DecodeString {

    public String decodeString(String s) {
        return helper(s, new int[]{0});
    }

    private String helper(String s, int[] index) {
        StringBuilder result = new StringBuilder();
        int num = 0;

        while (index[0] < s.length()) {
            char c = s.charAt(index[0]);

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
                index[0]++;
            }

            else if (c == '[') {
                index[0]++;
                String decoded = helper(s, index);

                for (int i = 0; i < num; i++) {
                    result.append(decoded);
                }
                num = 0;
            }

            else if (c == ']') {
                index[0]++;
                return result.toString();
            }

            else {
                result.append(c);
                index[0]++;
            }
        }

        return result.toString();
    }
    public  static void main(String[] args)
    {
        DecodeString obj =new DecodeString();
        String s ="3[a]2[bc]";
        System.out.println(obj.decodeString(s));


    }
}