public class Main {
    public static void main(String[] args) {
    
        String str = null; // nullを代入
        try {
            System.out.println(str.length()); // NullPointerExceptionが発生
        } catch (NullPointerException e) { // NullPointerExceptionをキャッチ
            System.out.println("NullPointerExceptionが発生しました！"); // メッセージ出力
            System.out.println("例外メッセージ: " + e.getMessage()); // 例外詳細出力
        }
    }
}