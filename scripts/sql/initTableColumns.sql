CREATE PROCEDURE `jymanager`.`getTableColumns` ()
BEGIN
	DECLARE m_schema varchar(20);
	DECLARE tablename VARCHAR(50); 
	DECLARE last_tablename VARCHAR(50); 
	DECLARE colname VARCHAR(50); 
	DECLARE coltype VARCHAR(50); 
	declare jsonfull varchar(3000);
	declare jsontable varchar(500);
	DECLARE Done INT DEFAULT 0;
    
    DECLARE c_rs CURSOR for (select `table_name`,`column_name`,`data_type` from `information_schema`.`columns` where table_schema=m_schema order by `table_name` , `ordinal_position`);


    DECLARE CONTINUE HANDLER FOR NOT FOUND SET Done=1;

	set jsonfull='';
	set jsontable='';	
	
    set m_schema='jymanager';
	OPEN c_rs;       

	-- [[{field:'id',title:'id',width:100},{field:'password',title:'password',width:100,align:'right'}]]
	


	set last_tablename=tablename;
	REPEAT 
    	FETCH NEXT from c_rs INTO tablename, colname, coltype;   
        if not Done then
        	if last_tablename="" then
				set last_tablename=tablename;
			end if;
			if last_tablename<>tablename THEN 
 				if LENGTH(jsonfull) > 0 then
					set jsonfull = concat("[[", left(jsonfull, LENGTH(jsonfull) - 1), "]]");
					set jsonfull = concat("var tb_",tablename,"=\"",jsonfull, "\";");
				end if;
				set last_tablename=tablename;           
			end if;
            
			if 	coltype="valchar" then
				set jsontable=concat("{field:'", colname, "',title:'", colname, "',width:200},");
			else
				set jsontable=concat("{field:'", colname, "',title:'", colname, "',width:100},");
			end if;
			
			set jsonfull=concat(jsonfull, jsontable);            
 
		else
			if LENGTH(jsonfull) > 0 then
				set jsonfull = concat("[[", left(jsonfull, LENGTH(jsonfull) - 1), "]]");
				set jsonfull = concat("var tb_",tablename,"=\"",jsonfull, "\";");
			end if;
        end if;
         
	    
	UNTIL Done END REPEAT; 


	
	CLOSE c_rs; 

    
    select jsonfull into outfile 'E:/workspace/JYmanager/src/main/webapp/js/table_columns.js';

END

