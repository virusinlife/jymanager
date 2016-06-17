
function JSONToCSVConvertor(JSONData, ReportTitle, ShowLabel) {
    //If JSONData is not an object then JSON.parse will parse the JSON string in an Object
    var arrData = typeof JSONData != 'object' ? JSON.parse(JSONData) : JSONData;
 
    var CSV = '';
    
    var sepor = ',';
    //Set Report title in first row or line
 
    CSV  = ReportTitle + '\r\n\n';
 
    //This condition will generate the Label/Header
    if (ShowLabel) {
        var row = "";
 
        //This loop will extract the label from 1st index of on array
        for (var index in arrData[0]) {
 
            //Now convert each value to string and comma-seprated
            row  += index + sepor;
        }
 
        row = row.slice(0, -1);
 
        //append Label row with line break
        CSV  += row + '\r\n';
    }
 
    //1st loop is to extract each row
    for (var i = 0; i < arrData.length; i++) {
        var row = "";
 
        //2nd loop will extract each column and convert it in string comma-seprated
        for (var index in arrData[i]) {
            row  += '' + arrData[i][index] + '' + sepor;
        }
 
        row.slice(0, row.length - 1);
 
        //add a line break after each row
        CSV  += row + '\r\n';
    }
 
    if (CSV == '') {
        alert("Invalid data");
        return;
    }
 
    //Generate a file name
    var fileName = "MyReport_";
    //this will remove the blank-spaces from the title and replace it with an underscore
    fileName  += ReportTitle.replace(/ /g, "_");
    
    //console.log(CSV);
    //console.log(Utf8ToUnicode(CSV));
    
    
    //Initialize file format you want csv or xls
    //var uri = 'data:text/csv;charset=GBK,' + Utf8ToUnicode(CSV);
    var uri = 'data:text/csv,' + Utf8ToUnicode(CSV);
    // Now the little tricky part.
    // you can use either>> window.open(uri);
    // but this will not work in some browsers
    // or you will not get the correct file extension    
 
    //this trick will generate a temp <a /> tag
    var link = document.createElement("a");
    link.href = uri;
 
    //set the visibility hidden so it will not effect on your web-layout
    link.style = "visibility:hidden";
    link.download = fileName + "test.csv";
 
    //this part will append the anchor tag and remove it after automatic click
    document.body.appendChild(link);
    link.click();
    document.body.removeChild(link);
}



function Utf8ToUnicode(strUtf8) {  
    var bstr = "";  
    var nTotalChars = strUtf8.length; // total chars to be processed.  
    var nOffset = 0; // processing point on strUtf8  
    var nRemainingBytes = nTotalChars; // how many bytes left to be converted  
    var nOutputPosition = 0;  
    var iCode, iCode1, iCode2; // the value of the unicode.  
    while (nOffset < nTotalChars) {  
        iCode = strUtf8.charCodeAt(nOffset);  
        if ((iCode & 0x80) == 0) // 1 byte.  
        {  
            if (nRemainingBytes < 1) // not enough data  
                break;  
            bstr += String.fromCharCode(iCode & 0x7F);  
            nOffset++;  
            nRemainingBytes -= 1;  
        }  
        else if ((iCode & 0xE0) == 0xC0) // 2 bytes  
        {  
            iCode1 = strUtf8.charCodeAt(nOffset + 1);  
            if (nRemainingBytes < 2 || // not enough data  
                    (iCode1 & 0xC0) != 0x80) // invalid pattern  
            {  
                break;  
            }  
            bstr += String  
                    .fromCharCode(((iCode & 0x3F) << 6) | (iCode1 & 0x3F));  
            nOffset += 2;  
            nRemainingBytes -= 2;  
        } else if ((iCode & 0xF0) == 0xE0) // 3 bytes  
        {  
            iCode1 = strUtf8.charCodeAt(nOffset + 1);  
            iCode2 = strUtf8.charCodeAt(nOffset + 2);  
            if (nRemainingBytes < 3 || // not enough data  
                    (iCode1 & 0xC0) != 0x80 || // invalid pattern  
                    (iCode2 & 0xC0) != 0x80) {  
                break;  
            }  
            bstr += String.fromCharCode(((iCode & 0x0F) << 12)  
                    | ((iCode1 & 0x3F) << 6) | (iCode2 & 0x3F));  
            nOffset += 3;  
            nRemainingBytes -= 3;  
        } else  
            // 4 or more bytes -- unsupported  
            break;  
    }  
    if (nRemainingBytes != 0) { // bad UTF8 string.                  
        return "";  
    }  
    return bstr;  
}  