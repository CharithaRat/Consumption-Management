package lk.ijse.absd.consm.service.impl;

import lk.ijse.absd.consm.repository.TestRepo;
import lk.ijse.absd.consm.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class TestServiceIMPL implements TestService {

    @Autowired
    private TestRepo repo;

    @Override
    public void set() {
    }
}
