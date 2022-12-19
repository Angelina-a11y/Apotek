-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Des 2022 pada 09.38
-- Versi server: 10.4.20-MariaDB
-- Versi PHP: 7.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir_apotek`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `id_admin` int(11) NOT NULL,
  `id_pegawai` int(30) NOT NULL,
  `nama_admin` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`id_admin`, `id_pegawai`, `nama_admin`) VALUES
(1001, 101, 'angelina'),
(1002, 102, 'putri');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(30) NOT NULL,
  `nama_pegawai` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `no_hp` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `nama_pegawai`, `alamat`, `no_hp`) VALUES
(101, 'angelina', 'Dalung Permai', 912341231),
(102, 'putri', 'dawas ', 812934857),
(103, 'doni', 'dalung', 876534743),
(104, 'adit', 'buduk', 823421233),
(106, 'lina', 'dalung', 89272738);

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `no_order` varchar(5) NOT NULL,
  `id_pegawai` int(30) NOT NULL,
  `id_obat` varchar(50) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `hrga_satuan` int(11) NOT NULL,
  `jmlh` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `kembalian` int(11) NOT NULL,
  `tanggal` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`no_order`, `id_pegawai`, `id_obat`, `nama_obat`, `hrga_satuan`, `jmlh`, `subtotal`, `total`, `kembalian`, `tanggal`) VALUES
('f25', 101, '1011', 'Paracetamol', 5000, 1, 5000, 5000, 15000, '2022-02-02'),
('f27', 102, '1012', 'Vit C', 5000, 2, 10000, 10000, 10000, '2022-02-02'),
('f27', 104, '1011', 'Paracetamol', 5000, 1, 5000, 5000, 1000, '2022-02-02'),
('f15', 101, '1009', 'obat radang', 100000, 1, 100000, 110000, 890000, '2022-02-04'),
('f15', 101, '1011', 'Paracetamol', 5000, 2, 10000, 110000, 890000, '2022-02-04');

-- --------------------------------------------------------

--
-- Struktur dari tabel `stok_obat`
--

CREATE TABLE `stok_obat` (
  `kode` varchar(50) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `stok` int(20) NOT NULL,
  `harga` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `stok_obat`
--

INSERT INTO `stok_obat` (`kode`, `nama_obat`, `stok`, `harga`) VALUES
('1009', 'obat radang', 2, 100000),
('1011', 'Paracetamol', 97, 5000),
('1012', 'Vit C', 88, 5000),
('1013', 'Insto', 90, 15000),
('1014', 'Caladine', 91, 23000),
('1015', 'Antibiotik', 97, 15000),
('1016', 'Betadine', 100, 20000),
('1017', 'Decolgen', 99, 10000),
('1018', 'Diapet', 99, 4000),
('1019', 'Dopamin', 99, 60000),
('1021', 'vit a', 100, 1000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tmp_penjualan`
--

CREATE TABLE `tmp_penjualan` (
  `id` int(11) NOT NULL,
  `id_obat` varchar(50) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `hrga_satuan` int(11) NOT NULL,
  `jmlh` int(11) NOT NULL,
  `subtotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Trigger `tmp_penjualan`
--
DELIMITER $$
CREATE TRIGGER `beli` AFTER INSERT ON `tmp_penjualan` FOR EACH ROW BEGIN
UPDATE stok_obat SET stok = stok - new.jmlh
WHERE kode = new.id_obat;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `delete` AFTER DELETE ON `tmp_penjualan` FOR EACH ROW BEGIN
UPDATE stok_obat SET stok = stok + OLD.jmlh
WHERE kode = OLD.id_obat;
END
$$
DELIMITER ;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id_admin`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indeks untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD KEY `id_obat` (`id_obat`),
  ADD KEY `id_pegawai` (`id_pegawai`);

--
-- Indeks untuk tabel `stok_obat`
--
ALTER TABLE `stok_obat`
  ADD PRIMARY KEY (`kode`),
  ADD KEY `nama_obat` (`nama_obat`);

--
-- Indeks untuk tabel `tmp_penjualan`
--
ALTER TABLE `tmp_penjualan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_obat` (`id_obat`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `pegawai`
--
ALTER TABLE `pegawai`
  MODIFY `id_pegawai` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=124;

--
-- AUTO_INCREMENT untuk tabel `tmp_penjualan`
--
ALTER TABLE `tmp_penjualan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `admin_ibfk_1` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`);

--
-- Ketidakleluasaan untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_obat`) REFERENCES `stok_obat` (`kode`),
  ADD CONSTRAINT `penjualan_ibfk_2` FOREIGN KEY (`id_pegawai`) REFERENCES `pegawai` (`id_pegawai`);

--
-- Ketidakleluasaan untuk tabel `tmp_penjualan`
--
ALTER TABLE `tmp_penjualan`
  ADD CONSTRAINT `tmp_penjualan_ibfk_1` FOREIGN KEY (`id_obat`) REFERENCES `stok_obat` (`kode`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
