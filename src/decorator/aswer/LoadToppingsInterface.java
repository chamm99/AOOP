import java.util.List;

public interface LoadToppingsInterface {
    /*
     * 파일을 읽고 각 줄에 있는 내용을 리스트로 구성해서 반환함
     * @param 없음
     * @return 파일에 있는 각 줄의 내용을 각각 요소로 갖는 리스트
     */
    public List<String> load();
}