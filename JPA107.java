public class JPA107 {
    public static void main(String[] args) {
        // 建立 basketball 和 baseball 的運動成績物件
        SportScore basketball = new SportScore(1, 2, 3);
        SportScore baseball = new SportScore(10, 2, 3);

        // 計算並輸出 basketball 的分數
        System.out.println("Basketball 分數: " + basketball.calculateScore());

        // 計算並輸出 baseball 的分數
        System.out.println("Baseball 分數: " + baseball.calculateScore());
    }
}

// 定義運動成績類別
class SportScore {
    private int action; // 動作
    private int skill; // 技巧
    private int teamgame; // 團隊表現

    // 建構子
    public SportScore(int action, int skill, int teamgame) {
        this.action = action;
        this.skill = skill;
        this.teamgame = teamgame;
    }

    // 計算分數的方法
    public int calculateScore() {
        return action + skill + teamgame;
    }
}