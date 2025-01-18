class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPolindromeChecker() {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;

        }
        return true;

    }

    public void display() {
        if (isPolindromeChecker()) {
            System.out.println("This text is Polindrome");
        } else {
            System.out.println("This text is not Polindrome");
        }
    }

    public static void main(String[] args) {
        PalindromeChecker check = new PalindromeChecker("abbba");
        check.display();
    }
}