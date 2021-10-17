USE [master]
GO
/****** Object:  Database [Online Booking]    Script Date: 10/17/2021 4:02:05 PM ******/
CREATE DATABASE [Online Booking]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'Online Booking', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.TUOINGUYEN\MSSQL\DATA\Online Booking.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'Online Booking_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.TUOINGUYEN\MSSQL\DATA\Online Booking_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [Online Booking] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [Online Booking].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [Online Booking] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [Online Booking] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [Online Booking] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [Online Booking] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [Online Booking] SET ARITHABORT OFF 
GO
ALTER DATABASE [Online Booking] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [Online Booking] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [Online Booking] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [Online Booking] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [Online Booking] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [Online Booking] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [Online Booking] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [Online Booking] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [Online Booking] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [Online Booking] SET  ENABLE_BROKER 
GO
ALTER DATABASE [Online Booking] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [Online Booking] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [Online Booking] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [Online Booking] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [Online Booking] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [Online Booking] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [Online Booking] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [Online Booking] SET RECOVERY FULL 
GO
ALTER DATABASE [Online Booking] SET  MULTI_USER 
GO
ALTER DATABASE [Online Booking] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [Online Booking] SET DB_CHAINING OFF 
GO
ALTER DATABASE [Online Booking] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [Online Booking] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [Online Booking] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [Online Booking] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'Online Booking', N'ON'
GO
ALTER DATABASE [Online Booking] SET QUERY_STORE = OFF
GO
USE [Online Booking]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 10/17/2021 4:02:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[userId] [int] IDENTITY(1,1) NOT NULL,
	[UserName] [nvarchar](max) NOT NULL,
	[PassWord] [nvarchar](max) NOT NULL,
	[Email] [nvarchar](max) NULL,
	[FName] [nvarchar](max) NULL,
	[LName] [nvarchar](max) NULL,
	[Phone] [nvarchar](max) NULL,
	[isAdmin] [bit] NULL,
	[isBooker] [bit] NULL,
	[isOwner] [bit] NULL,
	[Picture] [nvarchar](max) NULL,
	[Block] [bit] NULL,
PRIMARY KEY CLUSTERED 
(
	[userId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Booking]    Script Date: 10/17/2021 4:02:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Booking](
	[BookingID] [int] IDENTITY(1,1) NOT NULL,
	[IDCustomer] [int] NULL,
	[IDOwner] [int] NULL,
	[CheckIn] [date] NULL,
	[CheckOut] [date] NULL,
	[TotalPrice] [float] NULL,
	[RoomID] [int] NOT NULL,
	[Status] [nvarchar](50) NULL,
 CONSTRAINT [PK_Booking] PRIMARY KEY CLUSTERED 
(
	[BookingID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Place]    Script Date: 10/17/2021 4:02:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Place](
	[PlaceID] [int] IDENTITY(1,1) NOT NULL,
	[Place] [nvarchar](max) NULL,
	[img] [nvarchar](50) NULL,
 CONSTRAINT [PK_Place] PRIMARY KEY CLUSTERED 
(
	[PlaceID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Room]    Script Date: 10/17/2021 4:02:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Room](
	[RoomID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[Description] [nvarchar](max) NULL,
	[Picture] [nvarchar](max) NULL,
	[OwnerID] [int] NOT NULL,
	[Status] [int] NOT NULL,
	[Area] [int] NOT NULL,
	[BedNumber] [int] NOT NULL,
	[Price] [money] NOT NULL,
	[Rating] [float] NOT NULL,
	[PlaceID] [int] NULL,
	[TypeID] [int] NULL,
 CONSTRAINT [PK_Room] PRIMARY KEY CLUSTERED 
(
	[RoomID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Type]    Script Date: 10/17/2021 4:02:05 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Type](
	[TypeID] [int] IDENTITY(1,1) NOT NULL,
	[Type] [nvarchar](max) NULL,
	[img] [nvarchar](50) NULL,
 CONSTRAINT [PK_Type] PRIMARY KEY CLUSTERED 
(
	[TypeID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([userId], [UserName], [PassWord], [Email], [FName], [LName], [Phone], [isAdmin], [isBooker], [isOwner], [Picture], [Block]) VALUES (1, N'at', N'12345', N'thutuoi', N'at', N'Nguyen', N'090856721', 1, 0, 0, N'undraw_profile.svg', 0)
INSERT [dbo].[Account] ([userId], [UserName], [PassWord], [Email], [FName], [LName], [Phone], [isAdmin], [isBooker], [isOwner], [Picture], [Block]) VALUES (2, N'to_an', N'1234', N'toanan', N'An', N'To', N'234567', 0, 0, 1, N'undraw_profile.svg', 0)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[Booking] ON 

INSERT [dbo].[Booking] ([BookingID], [IDCustomer], [IDOwner], [CheckIn], [CheckOut], [TotalPrice], [RoomID], [Status]) VALUES (1, 2, 1, CAST(N'2021-03-02' AS Date), CAST(N'2021-03-04' AS Date), 120000, 5, N'finish')
INSERT [dbo].[Booking] ([BookingID], [IDCustomer], [IDOwner], [CheckIn], [CheckOut], [TotalPrice], [RoomID], [Status]) VALUES (2, 2, 1, CAST(N'2021-08-20' AS Date), CAST(N'2021-08-29' AS Date), 451787, 7, N'accept')
INSERT [dbo].[Booking] ([BookingID], [IDCustomer], [IDOwner], [CheckIn], [CheckOut], [TotalPrice], [RoomID], [Status]) VALUES (3, 2, 1, CAST(N'2021-04-12' AS Date), CAST(N'2021-04-15' AS Date), 765456, 6, N'processing')
SET IDENTITY_INSERT [dbo].[Booking] OFF
GO
SET IDENTITY_INSERT [dbo].[Place] ON 

INSERT [dbo].[Place] ([PlaceID], [Place], [img]) VALUES (1, N'Đà Lạt', N'da_lat.jpg')
INSERT [dbo].[Place] ([PlaceID], [Place], [img]) VALUES (2, N'Mộc Châu', N'moc_chau.jpg')
INSERT [dbo].[Place] ([PlaceID], [Place], [img]) VALUES (3, N'Sapa', N'Sapa.jpg')
INSERT [dbo].[Place] ([PlaceID], [Place], [img]) VALUES (4, N'Vũng Tàu', N'vung_tau.jpg')
INSERT [dbo].[Place] ([PlaceID], [Place], [img]) VALUES (5, N'Ninh Bình', N'ninh_binh.jpg')
INSERT [dbo].[Place] ([PlaceID], [Place], [img]) VALUES (6, N'Cat Ba', N'cat_ba.jpg')
INSERT [dbo].[Place] ([PlaceID], [Place], [img]) VALUES (7, N'Đà Nẵng', N'da_nang.jpg')
SET IDENTITY_INSERT [dbo].[Place] OFF
GO
SET IDENTITY_INSERT [dbo].[Room] ON 

INSERT [dbo].[Room] ([RoomID], [Name], [Description], [Picture], [OwnerID], [Status], [Area], [BedNumber], [Price], [Rating], [PlaceID], [TypeID]) VALUES (5, N'Homstay Đà Lạt', NULL, N'homestay_da_lat.jpg', 1, 1, 35, 2, 700000.0000, 123, 1, 1)
INSERT [dbo].[Room] ([RoomID], [Name], [Description], [Picture], [OwnerID], [Status], [Area], [BedNumber], [Price], [Rating], [PlaceID], [TypeID]) VALUES (6, N'Căn hộ Hà Nội', NULL, N'can_ho_cho_thue.jpg', 1, 1, 42, 2, 1000000.0000, 23, 1, 1)
INSERT [dbo].[Room] ([RoomID], [Name], [Description], [Picture], [OwnerID], [Status], [Area], [BedNumber], [Price], [Rating], [PlaceID], [TypeID]) VALUES (7, N'Homestay Đồi', NULL, N'homestay_cho_thue.jpg', 1, 1, 25, 2, 600000.0000, 43, NULL, NULL)
INSERT [dbo].[Room] ([RoomID], [Name], [Description], [Picture], [OwnerID], [Status], [Area], [BedNumber], [Price], [Rating], [PlaceID], [TypeID]) VALUES (10, N'Hotel Hoa Lư', N'', N'khach_san_4sao.jpg', 1, 0, 30, 1, 500000.0000, 15, NULL, NULL)
INSERT [dbo].[Room] ([RoomID], [Name], [Description], [Picture], [OwnerID], [Status], [Area], [BedNumber], [Price], [Rating], [PlaceID], [TypeID]) VALUES (11, N'Hotel Trang An', NULL, N'hotel5sao.jpg', 1, 0, 45, 1, 1000000.0000, 65, NULL, NULL)
INSERT [dbo].[Room] ([RoomID], [Name], [Description], [Picture], [OwnerID], [Status], [Area], [BedNumber], [Price], [Rating], [PlaceID], [TypeID]) VALUES (13, N'Nhà Sàn Hồng Việt', NULL, N'nha_san_hong_viet.jpg', 1, 1, 32, 3, 800000.0000, 34, NULL, NULL)
SET IDENTITY_INSERT [dbo].[Room] OFF
GO
SET IDENTITY_INSERT [dbo].[Type] ON 

INSERT [dbo].[Type] ([TypeID], [Type], [img]) VALUES (1, N'Căn hộ', N'can_ho.jpg')
INSERT [dbo].[Type] ([TypeID], [Type], [img]) VALUES (2, N'Homestay', N'homestay.jpg')
INSERT [dbo].[Type] ([TypeID], [Type], [img]) VALUES (3, N'Hotel', N'hotel.jpg')
INSERT [dbo].[Type] ([TypeID], [Type], [img]) VALUES (4, N'Nhà sàn', N'nha_san.jpg')
INSERT [dbo].[Type] ([TypeID], [Type], [img]) VALUES (5, N'Resort', N'resort.jpg')
INSERT [dbo].[Type] ([TypeID], [Type], [img]) VALUES (6, N'Biệt Thự', N'biet_thu.jpg')
SET IDENTITY_INSERT [dbo].[Type] OFF
GO
ALTER TABLE [dbo].[Room]  WITH CHECK ADD FOREIGN KEY([PlaceID])
REFERENCES [dbo].[Place] ([PlaceID])
GO
ALTER TABLE [dbo].[Room]  WITH CHECK ADD FOREIGN KEY([TypeID])
REFERENCES [dbo].[Type] ([TypeID])
GO
USE [master]
GO
ALTER DATABASE [Online Booking] SET  READ_WRITE 
GO
