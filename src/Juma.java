public enum Juma {
    Monday("Дуйшомбу куну мен Жава окуйм"),
    Tuesday("Шейшемби куну англис тили "),
    Wednesday("Шаршемби куну мен Английский окуйм"),
    Thursday("Бейшемби куну soft skils"),
    Friday("Жума куну Английский"),
    Saturday("Ищемби куну дома "),
    Sunday("Жекшемби куну тоже");

    private String getInfo;

    Juma(String getInfo) {
        this.getInfo = getInfo;
    }

    public String getGetInfo() {
        return getInfo;
    }

    public void setGetInfo(String getInfo) {
        this.getInfo = getInfo;
    }

    @Override
    public String toString() {
        return "Juma{" +
                "getInfo='" + getInfo + '\'' +
                '}'+super.toString();
    }
}
