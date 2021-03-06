package cn.zhangxd.mimiron.core.service.filter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import java.time.LocalDate;
import java.util.List;

/**
 * Filter class for {@link LocalDate} type attributes.
 *
 * @see RangeFilter
 */
public class LocalDateFilter extends RangeFilter<LocalDate> {

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public LocalDateFilter setEquals(LocalDate equals) {
        super.setEquals(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public LocalDateFilter setGreaterThan(LocalDate equals) {
        super.setGreaterThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public LocalDateFilter setGreaterOrEqualThan(LocalDate equals) {
        super.setGreaterOrEqualThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public LocalDateFilter setLessThan(LocalDate equals) {
        super.setLessThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public LocalDateFilter setLessOrEqualThan(LocalDate equals) {
        super.setLessOrEqualThan(equals);
        return this;
    }

    @Override
    @DateTimeFormat(iso = ISO.DATE)
    public LocalDateFilter setIn(List<LocalDate> in) {
        super.setIn(in);
        return this;
    }

}
