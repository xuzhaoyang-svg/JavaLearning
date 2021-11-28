package javacode.src.project1;

public class Test {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.setSpeed(2200);

        HardDisk disk = new HardDisk();//创建HardDisk对象

        disk.setAmount(200);

        PC pc = new PC();//创建PC对象

        pc.setCPU(cpu);

        pc.setHardDisk(disk);

        pc.show();
    }
}

class PC {
    CPU cpu;
    HardDisk HD;

    void setCPU(CPU c) {
        cpu = c;
    }

    void setHardDisk(HardDisk h) {
        HD = h;
    }

    void show() {
        System.out.println("CPU速度：" + cpu.getSpeed());
        System.out.println("硬盘的容量: " + HD.getAmount());
    }
}

class CPU {
    int speed;

    void setSpeed(int m) {

        speed = m;
    }


    int getSpeed() {

        return speed;
    }


}

class HardDisk {
    int amount;

    void setAmount(int m) {

        amount = m;
    }

    int getAmount() {
        return amount;
    }


}