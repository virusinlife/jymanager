package com.jymanager.service;

import java.util.List;

import com.jymanager.model.TMetadata;
import com.jymanager.model.TableColumns;

public interface TableColumnsService {

	List<TableColumns> getTableColumnsByTableName(String tablename);
	List<TMetadata> getTableMetadatasByID(String id);
}
