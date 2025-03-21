package management;

public interface ManagementTeam {
    boolean addParkingLot(String location, int capacity);
    void enable(String parkingID);
    void disable(String parkingID);
    void alertAvailableSpace(String sptID);
    void alertOverstay(String sptID);
    void alertMaintenance(String sptID);
    void alertIllegalParking(String sptID);
    boolean isMaintenaceRequired(String sptID);
}
