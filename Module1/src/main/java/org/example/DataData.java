package org.example;


import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DataData {

    public static class Data {
        String code;
        String version;

        public Data(String code, String version) {
        this.code = code;
        this.version = version;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }
    @Override
    public String toString() {
        return "Data{" +  "code='" + code + '\'' +", version='" + version + '\'' +
                '}';
    }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Data data = (Data) o;
            return Objects.equals(code, data.code) && Objects.equals(version, data.version);
        }

        @Override
        public int hashCode() {
            return Objects.hash(code, version);
        }
    }

    public static void main(String[] args) {
        List<Data> dataList = List.of
                (new Data("22", "1"),
                new Data("11", "3"),
                new Data("33", "1"));
        List<Data> dataList1 = List.of
                (new Data("11", "3"),
                new Data("22", "3"),
                new Data("33", "2"));
        /*System.out.println(findData(dataList, dataList1));*/
        System.out.println("--------------------");
        System.out.println(findData2(dataList, dataList1));

    }

    /* public static Collection<String> findData(List<Data> data, List<Data> data2) {
        return data.stream()
                .filter(v1 -> data2.stream()
                        .anyMatch(v2 -> v1.getCode().equals(v2.getCode())
                                && !v1.getVersion().equals(v2.getVersion())))
                .map(Data::getCode)
                .toList();
    }*/

    public static Collection<String> findData2(List<Data> data, List<Data> data2) {
        return Stream.concat(data.stream(), data2.stream())
                .collect(Collectors.groupingBy(Data::getCode,
                        Collectors.mapping(Data::getVersion, Collectors.toSet())))
                .entrySet().stream()
                .filter(v -> v.getValue().size() > 1)
                .map(Map.Entry::getKey)
                .toList();
    }


    //Итоговый вывод - [33, 22], иклз и хэшкод определить, в одну строку через return.
}
