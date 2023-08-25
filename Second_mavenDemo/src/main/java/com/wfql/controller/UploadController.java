package com.wfql.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String upload() {
        return "upload";
    }

    @RequestMapping("/uploading")
    public String uploading(Model model, MultipartFile file, HttpServletRequest request) {
        if (file.getSize() != 0) {
            //先指定上传路径，获取对应物理路径
            String targetDirectory = request.getSession().getServletContext().getRealPath("/uploadFiles");
            String temFileName = file.getOriginalFilename();

            assert temFileName != null;
            int dot = temFileName.lastIndexOf('.');
            String ext = "";  //文件后缀名
            if ((dot > -1) && (dot < (temFileName.length() - 1))) {
                ext = temFileName.substring(dot + 1);
            }
            // 其他文件格式不处理
            if ("png".equalsIgnoreCase(ext) || "jpg".equalsIgnoreCase(ext) || "gif".equalsIgnoreCase(ext)) {
                // 重命名上传的文件名
                String targetFileName = renameFileName(temFileName);
                // 保存的新文件
                File target = new File(targetDirectory, targetFileName);
                System.out.println(target.getAbsolutePath());
                try {
                    // 保存文件
                    FileUtils.copyInputStreamToFile(file.getInputStream(), target);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                model.addAttribute("tips", "上传成功");
                return "upload";
            }
            model.addAttribute("tips", "选择的文件不是图片，请重新选择！");
            return "upload";
        }
        model.addAttribute("tips", "未选择文件");
        return "upload";
    }

    /*文件重命名方法*/
    public static String renameFileName(String fileName) {
        String formatDate = new SimpleDateFormat("yyMMddHHmmss").format(new Date()); // 当前时间字符串
        int random = new Random().nextInt(10000);
        String extension = fileName.substring(fileName.lastIndexOf(".")); // 文件后缀

        return formatDate + random + extension;
    }
}
