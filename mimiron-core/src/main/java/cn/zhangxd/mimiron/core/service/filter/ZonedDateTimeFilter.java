package cn.zhangxd.mimiron.core.service.filter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Filter class for {@link ZonedDateTime} type attributes.
 *
 * @see RangeFilter
 */
public class ZonedDateTimeFilter extends RangeFilter<ZonedDateTime> {

    @Override
    @DateTimeFormat(iso = ISO.DATE_TIME)
    public ZonedDateTimeFilter setEquals(ZonedDateTime equals) {
        super.setEquals(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE_TIME)
    public ZonedDateTimeFilter setGreaterThan(ZonedDateTime equals) {
        super.setGreaterThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE_TIME)
    public ZonedDateTimeFilter setGreaterOrEqualThan(ZonedDateTime equals) {
        super.setGreaterOrEqualThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE_TIME)
    public ZonedDateTimeFilter setLessThan(ZonedDateTime equals) {
        super.setLessThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE_TIME)
    public ZonedDateTimeFilter setLessOrEqualThan(ZonedDateTime equals) {
        super.setLessOrEqualThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE_TIME)
    public ZonedDateTimeFilter setIn(List<ZonedDateTime> in) {
        super.setIn(in);
        return this;
    }
}
