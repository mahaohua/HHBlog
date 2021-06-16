package com.haohua.blog.service.impl;

import com.haohua.blog.entity.Blog;
import com.haohua.blog.mapper.BlogMapper;
import com.haohua.blog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haohua
 * @since 2021-06-16
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
