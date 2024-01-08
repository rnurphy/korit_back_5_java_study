package com.study.ch08;

public class AService {
    ARepository aRepo;

    public AService(ARepository aRepo) {
        this.aRepo = aRepo;
    }

    void moveRepo() {
        aRepo.printAddress();
    }
}
