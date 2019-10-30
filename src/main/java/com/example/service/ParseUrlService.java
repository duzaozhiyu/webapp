package com.example.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

@Service
public class ParseUrlService {
    public String doParseUrl(String strurl, String er, String pr) {
        StringBuffer sb = new StringBuffer();
        StringBuffer result = new StringBuffer();
        InputStream in = null;
        InputStreamReader isr = null;
        BufferedReader bufr = null;
        try {
            URL url = new URL(strurl.trim());
            // URL url = new URL("http://www.baidu.com");
            in = url.openStream();
            isr = new InputStreamReader(in);
            bufr = new BufferedReader(isr);
            String str = null;
            while ((str = bufr.readLine()) != null) {
                // System.out.println(str);
                sb.append(str);
            }
            int indexS = sb.indexOf(er);
            if(indexS<0)
            {
                return "前缀有误，匹配不到";
            }
            System.out.println(indexS);

            int indexE = sb.indexOf(pr);
            if(indexE<0)
            {
                return "后缀有误，匹配不到";
            }
            System.out.println(indexE);
            result.append(sb.substring(indexS, indexE));

        } catch (Exception e) {
            close(in,isr,bufr);
            e.printStackTrace();
        }
        return result.toString();
    }

    public void close(InputStream cin, InputStreamReader cisr, BufferedReader cbufr) {
        if (cin != null) {
            try {
                cbufr.close();
                cisr.close();
                cin.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
