package com.zking.chatbot.api.interfaces;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.hc.client5.http.impl.async.CloseableHttpAsyncClient;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * Unit test for simple App.
 */

public class ApiTest{

    @Test
    public void query_unanswered_questions() throws IOException {
        CloseableHttpClient build = HttpClientBuilder.create().build();

        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/28885518425541/topics?scope=all&count=20");

        get.addHeader("cookie","sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%221936bfd21d18db-03ff3a392b796f-4c657b58-1440000-1936bfd21d29a2%22%2C%22first_id%22%3A%22%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTkzNmJmZDIxZDE4ZGItMDNmZjNhMzkyYjc5NmYtNGM2NTdiNTgtMTQ0MDAwMC0xOTM2YmZkMjFkMjlhMiJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%22%2C%22value%22%3A%22%22%7D%2C%22%24device_id%22%3A%221936bfd21d18db-03ff3a392b796f-4c657b58-1440000-1936bfd21d29a2%22%7D; zsxq_access_token=3E03C983-51CD-0523-2EE7-3F1E985989B0_B00E85D328C60C72; zsxqsessionid=a0f453fc1410c67d2492b801748357c8; abtest_env=product");
        get.addHeader("content-type:","application/json; charset=UTF-8");

        CloseableHttpResponse execute = build.execute(get);

        if(execute.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(execute.getEntity());
            System.out.println(res);
        }else {
            System.out.println(execute.getStatusLine().getStatusCode());
        }

    }


    @Test
    public void query_unanswered_questions_post() throws IOException {
        CloseableHttpClient build = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/5121424118412544/comments");

        post.addHeader("cookie","zsxq_access_token=3E03C983-51CD-0523-2EE7-3F1E985989B0_B00E85D328C60C72; zsxqsessionid=a0f453fc1410c67d2492b801748357c8; abtest_env=product; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22212212255822811%22%2C%22first_id%22%3A%221936bfd21d18db-03ff3a392b796f-4c657b58-1440000-1936bfd21d29a2%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTkzNmJmZDIxZDE4ZGItMDNmZjNhMzkyYjc5NmYtNGM2NTdiNTgtMTQ0MDAwMC0xOTM2YmZkMjFkMjlhMiIsIiRpZGVudGl0eV9sb2dpbl9pZCI6IjIxMjIxMjI1NTgyMjgxMSJ9%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22212212255822811%22%7D%2C%22%24device_id%22%3A%221936bfd21d18db-03ff3a392b796f-4c657b58-1440000-1936bfd21d29a2%22%7D");
        post.addHeader("content-type:","application/json");

        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"0000000\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"mentioned_user_ids\": []\n" +
                "  }\n" +
                "}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json","UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse execute = build.execute(post);
        if(execute.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(execute.getEntity());
            System.out.println(res);
        }else {
            System.out.println(execute.getStatusLine().getStatusCode());
        }
    }

    @Test
    public void test_chatGPT() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();

        HttpPost post = new HttpPost("https://api.openai.com/v1/completions");
        post.addHeader("Content-Type", "application/json");
        post.addHeader("Authorization", "Bearer 自行申请 https://beta.openai.com/overview");

        String paramJson = "{\"model\": \"text-davinci-003\", \"prompt\": \"帮我写一个java冒泡排序\", \"temperature\": 0, \"max_tokens\": 1024}";

        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));
        post.setEntity(stringEntity);

        CloseableHttpResponse response = httpClient.execute(post);
        if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        } else {
            System.out.println(response.getStatusLine().getStatusCode());
        }

    }



}
