package com.mah.samstrack.dao.branch;

import java.io.Serializable;
import java.util.List;

import com.mah.samstrack.model.Branch;

public interface Branch_Dao {

	public Serializable addBranch(Branch branch);
	public List<Branch> getAllBranch();

}
