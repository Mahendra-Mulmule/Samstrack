package com.mah.samstrack.service.branch;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mah.samstrack.dao.branch.Branch_Dao;
import com.mah.samstrack.model.Branch;
@Service
@Transactional
public class Branch_ServiceImpl implements Branch_Service {

	@Autowired
	private Branch_Dao branch_Dao;
	
	@Override
	public Serializable addBranch(Branch branch) {
		return branch_Dao.addBranch(branch);
	}

	@Override
	public List<Branch> getAllBranch() {
		return branch_Dao.getAllBranch();
	}

}
