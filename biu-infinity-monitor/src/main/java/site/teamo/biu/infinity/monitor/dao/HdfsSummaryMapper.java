package site.teamo.biu.infinity.monitor.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import site.teamo.biu.infinity.fweb.common.entity.monitor.HdfsSummary;
import site.teamo.biu.infinity.fweb.common.util.InfinityMapper;

@Mapper
@Component
public interface HdfsSummaryMapper extends InfinityMapper<HdfsSummary> {
}