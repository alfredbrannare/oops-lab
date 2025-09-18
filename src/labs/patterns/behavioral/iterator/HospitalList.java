package labs.patterns.behavioral.iterator;

import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HospitalList implements Iterable<Hospital> {
    private final List<Hospital> hospitals;

    public HospitalList(List<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    @Override
    public Iterator<Hospital> iterator() {
        return new HospitalIterator(hospitals);
    }

    public Iterable<Hospital> largeHospitals() {
        return () -> new LargeHospitalIterator(hospitals);
    }

    private static class HospitalIterator implements Iterator<Hospital> {
        private final List<Hospital> hospitals;
        private int index = 0;

        public HospitalIterator(List<Hospital> hospitals) {
            this.hospitals = hospitals;
        }

        @Override
        public boolean hasNext() {
            return index < hospitals.size();
        }

        @Override
        public Hospital next() {
            if (hasNext()) {
                return hospitals.get(index++);
            }

            throw new NoSuchElementException();
        }
    }

    public static class LargeHospitalIterator implements Iterator<Hospital> {
        private final List<Hospital> hospitals;
        private int index = 0;

        public LargeHospitalIterator(List<Hospital> hospitals) {
            this.hospitals = hospitals;
        }

        @Override
        public boolean hasNext() {
            while (index < hospitals.size() && hospitals.get(index).getCount() <= 20) {
                index++;
            }

            return index < hospitals.size();
        }

        @Override
        public Hospital next() {
            return null;
        }

    }
}
