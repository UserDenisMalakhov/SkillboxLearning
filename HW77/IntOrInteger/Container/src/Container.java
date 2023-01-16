public class Container {
    private int count; // к неинициализированной переменной можно прибавить число
    //неинициализированный объект возвращает null, к нему нельзя прибавить число

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
