package com.demo.service;

import java.util.List;

import com.demo.model.TableColumns;

public interface TableColumnsService {

	List<TableColumns> getTableColumnsByTableName(String tablename);

}
