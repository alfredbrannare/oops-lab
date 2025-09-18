package labs.patterns.behavioral.iterator;

public record Hospital(
        String name,
        int count
) {
    public int getCount() {
        return count;
    }
}
