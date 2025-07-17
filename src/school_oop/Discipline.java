package school_oop;

public class Discipline {
    private String name;
    private int workload;

    public Discipline(String name, int workload) {
        this.name = name;
        this.workload = workload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}
