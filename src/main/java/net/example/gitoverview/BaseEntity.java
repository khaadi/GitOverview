package net.example.gitoverview;

public class BaseEntity {

    private long id;

    public double getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                '}';
    }

    public boolean isNew() {
        return (this.id == 0);
    }
}
